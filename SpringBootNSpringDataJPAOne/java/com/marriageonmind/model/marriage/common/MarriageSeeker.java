package com.marriageonmind.model.marriage.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.LandLineNo;
import com.marriageonmind.model.MobileNo;
import com.marriageonmind.model.marriage.occupation.Occupation;
import com.marriageonmind.model.marriage.qualification.Qualification;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="MarriageSeekerType",discriminatorType=DiscriminatorType.STRING)
public abstract class MarriageSeeker implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	
	private int heightFeet; //apply  constraint
	private int heightInch; //apply constraint
	private int heightInCm; 
	
	@OneToOne
	private Address currentAddress;
	@OneToOne
	private Address permanentAddress;
	
	@ManyToOne
	private Father father;
	@ManyToOne
	private Mother mother;

	@OneToMany
	private Set<Qualification> qualification;
	
	@ManyToOne
	private Occupation occupation;
	
	@OneToOne
	private Guardian guardian;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth; //apply constraint //verify through adharid
	
	private String birthTime;
	
	@OneToMany
	private Collection<MobileNo> mobileNos;// apply constraint
	
	@OneToOne
	private LandLineNo landLineNumber;
	
	@OneToOne
	private Email emailId;//only one emailID
	
	@OneToMany
	private Collection<String> photo;//
	
	
	private String video;//youtube Video URL
	
	private String AdharID;//apply constraint
	
	@Enumerated(EnumType.STRING)
	private ManglikStatus manglikStatus;
	

	@OneToMany(mappedBy="marriagePerson")
	private Collection<Brother> brothers;
	
	@OneToMany(mappedBy="marriagePerson")
	private Collection<Sister> sisters;

	@OneToOne
	private WebProfile webProfile;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Qualification> getQualification() {
		return qualification;
	}

	public void setQualification(Set<Qualification> qualification) {
		this.qualification = qualification;
	}

	public WebProfile getWebProfile() {
		return webProfile;
	}

	public void setWebProfile(WebProfile webProfile) {
		this.webProfile = webProfile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}

	public Collection<MobileNo> getMobileNos() {
		return mobileNos;
	}

	public void setMobileNos(Collection<MobileNo> mobileNos) {
		this.mobileNos = mobileNos;
	}

	public LandLineNo getLandLineNumber() {
		return landLineNumber;
	}

	public void setLandLineNumber(LandLineNo landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

	public Email getEmailId() {
		return emailId;
	}

	public void setEmailId(Email emailId) {
		this.emailId = emailId;
	}

	public Collection<String> getPhoto() {
		return photo;
	}

	public void setPhoto(Collection<String> photo) {
		this.photo = photo;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
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

	public Collection<Brother> getBrothers() {
		return brothers;
	}

	public void setBrothers(Collection<Brother> brothers) {
		this.brothers = brothers;
	}

	public Collection<Sister> getSisters() {
		return sisters;
	}

	public void setSisters(Collection<Sister> sisters) {
		this.sisters = sisters;
	}



}
