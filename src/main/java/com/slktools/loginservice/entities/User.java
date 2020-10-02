package com.slktools.loginservice.entities;

import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "userInfo")
@Table(name = "User_Info")
public class User {

	@Id
	@Column(name = "UNIQUE_ID", unique = true, nullable = false)
	private String uniqueId;

	@Column(name = "FULL_NAME", nullable = false)
	private String fullName;

	@Column(name = "F_NAME", nullable = false)
	private String firstName;

	@Column(name = "L_NAME")
	private String lastName;

	@Column(name = "EMAIL", unique = true, nullable = false)
	private String email;

	@Column(name = "DOB", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(name = "ADDRESS", nullable = false)
	private String address;

	@Column(name = "GENDER", nullable = false)
	private char gender;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "COUNTRY", nullable = false)
	private String country;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "PMOB_NUM", nullable = false, columnDefinition = "BIGINT")
	private long mobileNumber;

	@Column(name = "SMOB_NUM", columnDefinition = "BIGINT")
	private long secondMobileNumber;

	@Column(name = "USER_NAME", unique = true, nullable = false)
	private String userName;

	@Column(name = "CREATE_DATE", nullable = false)
	private ZonedDateTime creationDate;

	@Column(name = "MOD_DATE")
	private ZonedDateTime modDate;

	@Column(name = "DELETE_DATE")
	private ZonedDateTime deletingDate;

	@Column(name = "STATUS", nullable = false)
	private char status;

	public User(String uniqueId, String fullName, String firstName, String lastName, String email, Date dateOfBirth,
			String address, char gender, String password, String state, String country, String city, long mobileNumber,
			long secondMobileNumber, String userName, ZonedDateTime creationDate, ZonedDateTime modDate,
			ZonedDateTime deletingDate, char status) {
		super();
		this.uniqueId = uniqueId;
		this.fullName = fullName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.state = state;
		this.country = country;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.secondMobileNumber = secondMobileNumber;
		this.userName = userName;
		this.creationDate = creationDate;
		this.modDate = modDate;
		this.deletingDate = deletingDate;
		this.status = status;
	}

	public User() {
		super();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getSecondMobileNumber() {
		return secondMobileNumber;
	}

	public void setSecondMobileNumber(long secondMobileNumber) {
		this.secondMobileNumber = secondMobileNumber;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ZonedDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ZonedDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public ZonedDateTime getModDate() {
		return modDate;
	}

	public void setModDate(ZonedDateTime modDate) {
		this.modDate = modDate;
	}

	public ZonedDateTime getDeletingDate() {
		return deletingDate;
	}

	public void setDeletingDate(ZonedDateTime deletingDate) {
		this.deletingDate = deletingDate;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [uniqueId=" + uniqueId + ", fullName=" + fullName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", gender="
				+ gender + ", password=" + password + ", state=" + state + ", country=" + country + ", city=" + city
				+ ", mobileNumber=" + mobileNumber + ", secondMobileNumber=" + secondMobileNumber + ", userName="
				+ userName + ", creationDate=" + creationDate + ", modDate=" + modDate + ", deletingDate="
				+ deletingDate + ", status=" + status + "]";
	}

}
