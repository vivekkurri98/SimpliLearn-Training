package eg2;

public class Address {
	
	private int addressId;
	private int zipCode;
	private String cityName;
	private String stateName;
	private String country;	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, int zipCode, String cityName, String stateName, String country) {
		super();
		this.addressId = addressId;
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.stateName = stateName;
		this.country = country;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void printAddress() {
		System.out.println("Address Id: "+addressId);
		System.out.println("Zip Code: "+zipCode);
		System.out.println("City Name: "+cityName);
		System.out.println("State Name: "+stateName);
		System.out.println("Country: "+country);
	}
}
