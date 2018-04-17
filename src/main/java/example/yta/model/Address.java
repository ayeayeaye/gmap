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
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="address_id")
	private int addressId;

	@Column(name="road_name")
	private String roadName;
	
	@Column(name="latitude")
	private String lat;

	@Column(name="longitude")
	private String longt;

	@Column(name="addbyuser")
	private int addByUser;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="addbyuser", insertable=false, updatable=false)
	private UserProfile userModel;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String roadName, String lat, String longt, int addByUser, UserProfile userModel) {
		super();
		this.addressId = addressId;
		this.roadName = roadName;
		this.lat = lat;
		this.longt = longt;
		this.addByUser = addByUser;
		this.userModel = userModel;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLongt() {
		return longt;
	}

	public void setLongt(String longt) {
		this.longt = longt;
	}

	public int getAddByUser() {
		return addByUser;
	}

	public void setAddByUser(int addByUser) {
		this.addByUser = addByUser;
	}

	public UserProfile getUserModel() {
		return userModel;
	}

	public void setUserModel(UserProfile userModel) {
		this.userModel = userModel;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", roadName=" + roadName + ", lat=" + lat + ", longt=" + longt
				+ ", addByUser=" + addByUser + ", userModel=" + userModel + "]";
	}
	
}