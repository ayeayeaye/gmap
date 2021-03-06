package example.yta.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import example.yta.model.UserProfile;
import example.yta.repository.UserProfileRepository;

@Service
public class UserProfileSericeImp implements UserProfileService {

	@Resource
	UserProfileRepository repository;
	
	@Override
	public void saveUser(UserProfile userProfile) {
		repository.save(userProfile);
	}

	@Override
	public int getLastUserId() {
		int lastUserId = repository.getLastUserId();
		return lastUserId;
	}

	@Override
	public List<UserProfile> getAllUserProfile() {
		List<UserProfile> upList = repository.findAll();
		return upList;
	}

	@Override
	public UserProfile getUserProByuserid(Integer userId) {
		UserProfile upro = repository.getUserProByuserid(userId);
		return upro;
	}

}
