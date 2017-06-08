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
import com.marriageonmind.model.Email;
import com.marriageonmind.model.LandLineNo;
import com.marriageonmind.model.MobileNo;

@Entity
public class Bride implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;
	private String lastName;
private int heightFeet; //apply constraint
private int heightInch; //apply constraint
private int heightInCm;

private JobStatus jobStatus;
private Father father;
private Mother mother;
private String alsoQualifiedIn;
private Set<Relative> relatives;

private Complexion complexion;
private Date dateOfBirth; //apply constraint //verify through adharid
private Set<MobileNo> mobileNos;// apply constraint
private LandLineNo landLineNumber;
private Profession profession;

private Email emailId;//only one emailID
private Set<URL> photo;//
private URL video;//youtube Video URL
private String AdharID;//apply constraint
private ManglikStatus manglikStatus;
private MaritalStatus maritalStatus;

private Job job;

private Set<Brother> brothers;
private Set<Sister> sisters;

private Address currentAddress;
private Address permanentAddress;
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
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
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
public JobStatus getJobStatus() {
	return jobStatus;
}
public void setJobStatus(JobStatus jobStatus) {
	this.jobStatus = jobStatus;
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
public String getAlsoQualifiedIn() {
	return alsoQualifiedIn;
}
public void setAlsoQualifiedIn(String alsoQualifiedIn) {
	this.alsoQualifiedIn = alsoQualifiedIn;
}
public Set<Relative> getRelatives() {
	return relatives;
}
public void setRelatives(Set<Relative> relatives) {
	this.relatives = relatives;
}
public Complexion getComplexion() {
	return complexion;
}
public void setComplexion(Complexion complexion) {
	this.complexion = complexion;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
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
public Email getEmailId() {
	return emailId;
}
public void setEmailId(Email emailId) {
	this.emailId = emailId;
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
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
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

}
