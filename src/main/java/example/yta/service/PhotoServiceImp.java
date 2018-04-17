package example.yta.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import example.yta.model.Photo;
import example.yta.model.UserProfile;
import example.yta.repository.PhotoRepository;
import example.yta.repository.UserProfileRepository;

@Service
public class PhotoServiceImp implements PhotoService {

	@Resource
	PhotoRepository repository;
	
	@Override
	public void savePhoto(Photo photo) {
		repository.save(photo);
	}

	@Override
	public List<Photo> getAllPhoto() {
		List<Photo> photoList = repository.findAll();
		return photoList;
	}

	@Override
	public Photo getPhotoByuserid(Integer userId) {
		Photo p = repository.getPhotoByuserid(userId);
		return p;
	}


}
