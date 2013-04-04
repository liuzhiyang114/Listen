package cn.smartlab.map;

public class City {

	private String cityNo;
	private String cityName;
	private String parkNo;

	public City() {
		super();
	}

	public City(String cityNo, String cityName, String parkNo) {
		super();
		this.cityNo = cityNo;
		this.cityName = cityName;
		this.parkNo = parkNo;
	}

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getParkNo() {
		return parkNo;
	}

	public void setParkNo(String parkNo) {
		this.parkNo = parkNo;
	}

}
