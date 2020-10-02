package com.slktools.loginservice.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String uniqueId;
	private String fullName;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@Email
	@Size(min = 3)
	private String email;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Past
	private Date dateOfBirth;

	@NotBlank
	@Size(min = 4)
	private String address;

	@NotNull
	private char gender;

	@NotBlank
	@Size(min = 6)
	private String password;

	@NotBlank
	private String state;

	@NotBlank
	private String country;

	@NotBlank
	private String city;

	@NotNull
	@Digits(integer = 10, fraction = 0)
	@Positive
	@Min(value = 100000)
	private long mobileNumber;
	private long secondMobileNumber;

	@NotBlank
	@Size(min = 6)
	private String userName;
	private ZonedDateTime creationDate;
	private ZonedDateTime modDate;
	private ZonedDateTime deletingDate;
	private char status;

	public UserDTO(String uniqueId, String fullName, String firstName, String lastName, String email, Date dateOfBirth,
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

	public UserDTO() {
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

	// @JsonDeserialize(using = CustomDateFormat.class)
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
		return "UserDTO [uniqueId=" + uniqueId + ", fullName=" + fullName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", gender="
				+ gender + ", password=" + password + ", state=" + state + ", country=" + country + ", city=" + city
				+ ", mobileNumber=" + mobileNumber + ", secondMobileNumber=" + secondMobileNumber + ", userName="
				+ userName + ", creationDate=" + creationDate + ", modDate=" + modDate + ", deletingDate="
				+ deletingDate + ", status=" + status + "]";
	}

}
