package example.yta.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user_profile")
public class UserProfile {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@NotNull(message="User Name cannot be empty.")
	@Column(name="name")
	private String name;
	
	@Column(name="nric")
	@NotNull
	private String nric;
	
	@Column(name="email")
	private String email;
	
	@Column(name="job")
	private String job;
	@Column(name="income")
	private double income;
	@Column(name="education")
	private String education;
	@Column(name="adult_no")
	private int adultNo;
	@Column(name="child_no")
	private int childNo;
	@Column(name="house_type")
	private String houseType;
	@Column(name="comment")
	private String comment;


	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfile(int userId, String name, String nric, String email, String job, double income, String education,
			int adultNo, int childNo, String houseType, String comment) {
		super();
		this.userId = userId;
		this.name = name;
		this.nric = nric;
		this.email = email;
		this.job = job;
		this.income = income;
		this.education = education;
		this.adultNo = adultNo;
		this.childNo = childNo;
		this.houseType = houseType;
		this.comment = comment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNric() {
		return nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getAdultNo() {
		return adultNo;
	}

	public void setAdultNo(int adultNo) {
		this.adultNo = adultNo;
	}

	public int getChildNo() {
		return childNo;
	}

	public void setChildNo(int childNo) {
		this.childNo = childNo;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", name=" + name + ", nric=" + nric + ", email=" + email + ", job="
				+ job + ", income=" + income + ", education=" + education + ", adultNo=" + adultNo + ", childNo="
				+ childNo + ", houseType=" + houseType + ", comment=" + comment + "]";
	}

	
}
