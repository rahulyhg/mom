package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.City;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.LandLineNo;
import com.marriageonmind.model.MobileNo;

@Entity
public class Groom implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lasttName;
	
	private String alsoQualifiedIn;
	private Email email;
	private Set<MobileNo> mobileNos;
	private LandLineNo landLineNumber;

	private Profession profession;
	private Job job;
	
	private int heightFeet;
	private int heightInch;
	private int heightInCm;
	
	private Father father;
	private Mother mother;
	private Set<Relative> relatives;
	private Set<URL> photo;//
	private URL video;//youtube Video URL
	
	private String AdharID;//apply constraint
	private ManglikStatus manglikStatus;
	private MaritalStatus maritalStatus;
	
	private Date dateOfBirth;
	
	
	private Set<Brother> brothers;
	private Set<Sister> sisters;
	
	private City nativePlace;
	
	private Address currentAddress;
	private Address permanentAddress;
	
private Set<Qualification> qualifications;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLasttName() {
	return lasttName;
}

public void setLasttName(String lasttName) {
	this.lasttName = lasttName;
}

public String getAlsoQualifiedIn() {
	return alsoQualifiedIn;
}

public void setAlsoQualifiedIn(String alsoQualifiedIn) {
	this.alsoQualifiedIn = alsoQualifiedIn;
}

public Email getEmail() {
	return email;
}

public void setEmail(Email email) {
	this.email = email;
}

public Set<MobileNo> getMobileNos() {
	return mobileNos;
}

public void setMobileNos(Set<MobileNo> mobileNos) {
	this.mobileNos = mobileNos;
}

public LandLineNo getLandLineNumber() {
	return landLineNumber;
}

public void setLandLineNumber(LandLineNo landLineNumber) {
	this.landLineNumber = landLineNumber;
}

public Profession getProfession() {
	return profession;
}

public void setProfession(Profession profession) {
	this.profession = profession;
}

public Job getJob() {
	return job;
}

public void setJob(Job job) {
	this.job = job;
}

public int getHeightFeet() {
	return heightFeet;
}

public void setHeightFeet(int heightFeet) {
	this.heightFeet = heightFeet;
}

public int getHeightInch() {
	return heightInch;
}

public void setHeightInch(int heightInch) {
	this.heightInch = heightInch;
}

public int getHeightInCm() {
	return heightInCm;
}

public void setHeightInCm(int heightInCm) {
	this.heightInCm = heightInCm;
}

public Father getFather() {
	return father;
}

public void setFather(Father father) {
	this.father = father;
}

public Mother getMother() {
	return mother;
}

public void setMother(Mother mother) {
	this.mother = mother;
}

public Set<Relative> getRelatives() {
	return relatives;
}

public void setRelatives(Set<Relative> relatives) {
	this.relatives = relatives;
}

public Set<URL> getPhoto() {
	return photo;
}

public void setPhoto(Set<URL> photo) {
	this.photo = photo;
}

public URL getVideo() {
	return video;
}

public void setVideo(URL video) {
	this.video = video;
}

public String getAdharID() {
	return AdharID;
}

public void setAdharID(String adharID) {
	AdharID = adharID;
}

public ManglikStatus getManglikStatus() {
	return manglikStatus;
}

public void setManglikStatus(ManglikStatus manglikStatus) {
	this.manglikStatus = manglikStatus;
}

public MaritalStatus getMaritalStatus() {
	return maritalStatus;
}

public void setMaritalStatus(MaritalStatus maritalStatus) {
	this.maritalStatus = maritalStatus;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public Set<Brother> getBrothers() {
	return brothers;
}

public void setBrothers(Set<Brother> brothers) {
	this.brothers = brothers;
}

public Set<Sister> getSisters() {
	return sisters;
}

public void setSisters(Set<Sister> sisters) {
	this.sisters = sisters;
}

public City getNativePlace() {
	return nativePlace;
}

public void setNativePlace(City nativePlace) {
	this.nativePlace = nativePlace;
}

public Address getCurrentAddress() {
	return currentAddress;
}

public void setCurrentAddress(Address currentAddress) {
	this.currentAddress = currentAddress;
}

public Address getPermanentAddress() {
	return permanentAddress;
}

public void setPermanentAddress(Address permanentAddress) {
	this.permanentAddress = permanentAddress;
}

public Set<Qualification> getQualifications() {
	return qualifications;
}

public void setQualifications(Set<Qualification> qualifications) {
	this.qualifications = qualifications;
}

	
	

}
