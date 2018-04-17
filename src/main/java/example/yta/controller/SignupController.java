/*package example.yta.controller;

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
public class SignupController {


	String errorMsg = "Empty or wrong data.";
	
	

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
	public String submitSignupGet()
	{
		return "redirect:/signup/create";
	}
	@RequestMapping(value="/created", method=RequestMethod.POST)
	public ModelAndView submitSignupPost(@ModelAttribute ("user") User user, 
	@RequestParam("nricFile") MultipartFile nricFile, @RequestParam("faceFile") MultipartFile faceFile,@RequestParam("houseFile") MultipartFile houseFile,
	BindingResult result, HttpServletRequest request, HttpSession session) throws IOException
	{
		ModelAndView moView =  new ModelAndView();
		
        if (result.hasErrors() )
        {
        	moView.addObject("errorMsg", errorMsg);
            moView.setViewName("signup-form");
        } 
        else
        {      
        		//save UserProfile
		        userProfileService.saveUser(user.getUserprofile());	       
				
				moView.addObject("userName", user.getUserprofile().getName());
				moView.setViewName("success");

		
        }
                
		return moView;		
	}


}
*/