package cn.smartlab.listen;

public class CarBeans {

	private String carNo;
	private String carStatus;
	
	public CarBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarBeans(String carNo, String carStatus) {
		super();
		this.carNo = carNo;
		this.carStatus = carStatus;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	
	

}
