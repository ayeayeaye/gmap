package example.yta.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import example.yta.model.Address;
import example.yta.model.Photo;
import example.yta.model.UserProfile;
import example.yta.repository.AddressRepository;
import example.yta.repository.PhotoRepository;
import example.yta.repository.UserProfileRepository;

@Service
public class AddressServiceImp implements AddressService {

	@Resource
	AddressRepository repository;
	
	@Override
	public void saveAddress(Address address) {
		repository.save(address);
	}

	@Override
	public List<Address> getAllAddress() {
		List<Address> addList = repository.findAll();
		return addList;
	}

	@Override
	public Address getAddressByuserid(Integer userId) {
		Address add = repository.getAddressByuserid(userId);
		return add;
	}


}
