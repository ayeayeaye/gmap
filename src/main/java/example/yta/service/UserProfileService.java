package example.yta.service;


import java.util.List;

import example.yta.model.UserProfile;


public interface UserProfileService {

	void saveUser(UserProfile userProfile);

	int getLastUserId();

	List<UserProfile> getAllUserProfile();

	UserProfile getUserProByuserid(Integer userId);

}
