package example.yta.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import example.yta.javabean.User;
import example.yta.model.Address;
import example.yta.model.Photo;
import example.yta.model.UserProfile;
import example.yta.service.AddressService;
import example.yta.service.PhotoService;
import example.yta.service.UserProfileService;



@Controller
@RequestMapping(value="/view")
public class ViewController {


	@Autowired
	UserProfileService userProfileService;
	@Autowired
	PhotoService photoService;
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/map")
	public ModelAndView viewGoogleMapTest(){
		ModelAndView moView =  new ModelAndView("index");
		return moView;		
	}
	
	@RequestMapping(value="/all/user")
	public ModelAndView viewAllUser(){
		ModelAndView moView =  new ModelAndView("view-all-user");
		
		List<UserProfile> upList =userProfileService.getAllUserProfile();
		List<Address> addList = addressService.getAllAddress();
		List<Photo> photoList = photoService.getAllPhoto();
		
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < upList.size(); i++) {
			userList.add(new User(upList.get(i), photoList.get(i), addList.get(i)));
		}
		
		moView.addObject("userList", userList);	
		return moView;		
	}
	
	@RequestMapping(value="/user/{userId}")
	public ModelAndView viewAUserInfo(@PathVariable Integer userId,  HttpSession session){
		
		ModelAndView moView =  new ModelAndView("view-user");
		
		UserProfile up =userProfileService.getUserProByuserid(userId);
		Address add = addressService.getAddressByuserid(userId);
		Photo photo = photoService.getPhotoByuserid(userId);
		
		User user = new User(up,photo,add);
		moView.addObject("user", user);	
		return moView;
	}
	
	

	
}

