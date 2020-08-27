package com.techelevator.model;

public class Brewery {

   private Long id;
   private String breweryName;
   private String contactInfo;
   private String phone;
   private String website;
   private String email;
   private String address;
   private String city;
   private String stateAbv;
   private String zipcode;
   private String history;
   private String openTime;
   private String closeTime;
   private boolean isOpen;
   
   public Brewery() { }

   public Brewery(Long id, String breweryName, String contactInfo, String phone, String website, String address, String history, String openTime, String closeTime, Boolean isOpen) {
      this.id = id;
      this.breweryName = breweryName;
      this.contactInfo = contactInfo;
      this.phone = phone;
      this.website = website;
      this.address = address;
      this.openTime = openTime;
      this.closeTime = closeTime;
      this.history = history;
      this.isOpen = true;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getBreweryName() {
      return breweryName;
   }

   public void setBreweryName(String breweryName) {
      this.breweryName = breweryName;
   }

   public String getContactInfo() {
	return contactInfo;
	}
	
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	   
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateAbv() {
		return stateAbv;
	}

	public void setStateAbv(String stateAbv) {
		this.stateAbv = stateAbv;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getHistory() {
		return history;
	}
	
	public void setHistory(String history) {
		this.history = history;
	}
	
	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
   @Override
   public String toString() {
      return "Brewery{" +
              "id=" + id +
              ", breweryName='" + breweryName +
              ", phone=" + phone +
              ", website=" + website +
              ", address=" + address +
              ", city=" + city +
              ", state=" + stateAbv +
              ", zipcode=" + zipcode +
              ", history=" + history +
              ", isOpen=" + isOpen +
              '}';
   }
}