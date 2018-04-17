package example.yta.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="photo")
public class Photo {
	
	@Id
	@Column(name="photo_id")
	private int photoId;
	
	@Column(name="nric_photo")
	private String nricPhoto;
	
	@Column(name="face_photo")
	private String facePhoto;
	
	@Column(name="house_photo")
	private String housePhoto;
	
	@Column(name="photobyuser")
	private int photoByUser;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="photobyuser", insertable=false, updatable=false)
	private UserProfile userPModel;

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(int photoId, String nricPhoto, String facePhoto, String housePhoto, int photoByUser,
			UserProfile userPModel) {
		super();
		this.photoId = photoId;
		this.nricPhoto = nricPhoto;
		this.facePhoto = facePhoto;
		this.housePhoto = housePhoto;
		this.photoByUser = photoByUser;
		this.userPModel = userPModel;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public String getNricPhoto() {
		return nricPhoto;
	}

	public void setNricPhoto(String nricPhoto) {
		this.nricPhoto = nricPhoto;
	}

	public String getFacePhoto() {
		return facePhoto;
	}

	public void setFacePhoto(String facePhoto) {
		this.facePhoto = facePhoto;
	}

	public String getHousePhoto() {
		return housePhoto;
	}

	public void setHousePhoto(String housePhoto) {
		this.housePhoto = housePhoto;
	}

	public int getPhotoByUser() {
		return photoByUser;
	}

	public void setPhotoByUser(int photoByUser) {
		this.photoByUser = photoByUser;
	}

	public UserProfile getUserPModel() {
		return userPModel;
	}

	public void setUserPModel(UserProfile userPModel) {
		this.userPModel = userPModel;
	}

	@Override
	public String toString() {
		return "Photo [photoId=" + photoId + ", nricPhoto=" + nricPhoto + ", facePhoto=" + facePhoto + ", housePhoto="
				+ housePhoto + ", photoByUser=" + photoByUser + ", userPModel=" + userPModel + "]";
	}

	
}
