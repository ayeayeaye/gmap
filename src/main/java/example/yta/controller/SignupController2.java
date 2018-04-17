package example.yta.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import example.yta.javabean.User;
import example.yta.model.UserProfile;
import example.yta.service.AddressService;
import example.yta.service.PhotoService;
import example.yta.service.UserProfileService;
import example.yta.validator.UserProfileValidator;


@Controller
@RequestMapping(value="/signup")
public class SignupController2 {
	
	
	@Autowired
    UserProfileValidator userProfileValidator;
    @InitBinder("userprofile")
    protected void initBinderUserProfile(WebDataBinder binder) {
       binder.addValidators(userProfileValidator);
    }
    
	@Autowired
	UserProfileService userProfileService;
	@Autowired
	PhotoService photoService;
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/create")
	public ModelAndView createtSignup(){
		ModelAndView moView =  new ModelAndView("signup-form");
		moView.addObject("user", new User());
		return moView;		
	}
	
	@RequestMapping(value="/created", method=RequestMethod.GET)
	public ModelAndView submitSignupGet()
	{
		ModelAndView moView =  new ModelAndView("signup-form");
		return moView;
	}
	@RequestMapping(value="/created", method=RequestMethod.POST)
	public ModelAndView submitSignupPost(@ModelAttribute @Valid User user, 
	@RequestParam("nricFile") MultipartFile nricFile, @RequestParam("faceFile") MultipartFile faceFile,@RequestParam("houseFile") MultipartFile houseFile,
	BindingResult result, HttpServletRequest request, HttpSession session) throws IOException
	{
		ModelAndView moView =  new ModelAndView();
		
        if (result.hasErrors())
        {
            moView.setViewName("signup-form");
        } 
        else
        {      
			if(uploadPhoto(nricFile, faceFile, houseFile, request )!=true)
			{
				moView.setViewName("signup-form");
			}
			else
			{
		        //save UserProfile
		        userProfileService.saveUser(user.getUserprofile());	       
		        //To add/update foreign key after saving parent  
		        int maxUseId = userProfileService.getLastUserId();
	
		        //save Address
		        user.getAddress().setAddByUser(maxUseId);
		        addressService.saveAddress(user.getAddress());
		        //save Photo
		        user.getPhoto().setPhotoByUser(maxUseId);
				user.getPhoto().setNricPhoto(nricFile.getOriginalFilename());
				user.getPhoto().setFacePhoto(faceFile.getOriginalFilename());
				user.getPhoto().setHousePhoto(houseFile.getOriginalFilename());
				photoService.savePhoto(user.getPhoto());
				
				moView.setViewName("success");
				moView.addObject("userName", user.getUserprofile().getName());
			}
		
        }
                
		return moView;		
	}
	
	private boolean uploadPhoto(MultipartFile nricFile,MultipartFile faceFile,MultipartFile houseFile, HttpServletRequest request)
			throws IOException  {	
		
		boolean uploading = true; 
		String project_folder_location = "C:/Users/Yin/git/DS/";
		//String upload_location = request.getServletContext().getRealPath("") + "/photo/"; //C:\SpringToolSuite\sts-bundle\pivotal-tc-server-developer-3.2.2.RELEASE\base-instance\wtpwebapps\GMap\photo		
		String upload_location = project_folder_location +request.getContextPath() + "/src/main/webapp/photo/";
		System.out.println("***"+upload_location+"***");
	
		try {
			FileCopyUtils.copy(nricFile.getBytes(), new File(upload_location+nricFile.getOriginalFilename()));
			FileCopyUtils.copy(faceFile.getBytes(), new File(upload_location+houseFile.getOriginalFilename()));
			FileCopyUtils.copy(houseFile.getBytes(), new File(upload_location +faceFile.getOriginalFilename()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			uploading=false;
		}catch(NullPointerException e)
		{
			uploading=false;
		}
		return uploading;
	}

}
