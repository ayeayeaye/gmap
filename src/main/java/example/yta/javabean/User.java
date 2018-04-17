package example.yta.javabean;

import javax.validation.constraints.NotNull;

import example.yta.model.Address;
import example.yta.model.Photo;
import example.yta.model.UserProfile;


public class User {
	

	UserProfile userprofile = new UserProfile();
	Photo photo = new Photo();
	Address address = new Address();

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(UserProfile userprofile, Photo photo, Address address) {
		super();
		this.userprofile = userprofile;
		this.photo = photo;
		this.address = address;

	}

	public UserProfile getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(UserProfile userprofile) {
		this.userprofile = userprofile;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userprofile=" + userprofile + ", photo=" + photo + ", address=" + address + "]";
	}

}
