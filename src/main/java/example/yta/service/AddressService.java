package example.yta.service;

import java.util.ArrayList;
import java.util.List;

import example.yta.model.Address;
import example.yta.model.Photo;
import example.yta.model.UserProfile;


public interface AddressService {

	void saveAddress(Address address);

	List<Address> getAllAddress();

	Address getAddressByuserid(Integer userId);


}
