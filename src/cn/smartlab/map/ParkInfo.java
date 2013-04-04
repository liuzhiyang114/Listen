package cn.smartlab.map;

public class ParkInfo {

	private String parkNo;
	private String pName;
	private String lat;// γ��
	private String lon;// ����
	private int pAmount;
	private int restAmount;
	private String pInfo;
	private int delFlag; // �Ƿ�ɾ����Ϣ(�����ϲ�ɾ��),0:��ɾ��1��ɾ��(�߼���ɾ��)

	public ParkInfo() {
		super();
	}

	public ParkInfo(String parkNo, String pName, String lat, String lon,
			int pAmount, int restAmount, String pInfo, int delFlag) {
		super();
		this.parkNo = parkNo;
		this.pName = pName;
		this.lat = lat;
		this.lon = lon;
		this.pAmount = pAmount;
		this.restAmount = restAmount;
		this.pInfo = pInfo;
		this.delFlag = delFlag;
	}

	public String getParkNo() {
		return parkNo;
	}

	public void setParkNo(String parkNo) {
		this.parkNo = parkNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public int getpAmount() {
		return pAmount;
	}

	public void setpAmount(int pAmount) {
		this.pAmount = pAmount;
	}

	public int getRestAmount() {
		return restAmount;
	}

	public void setRestAmount(int restAmount) {
		this.restAmount = restAmount;
	}

	public String getpInfo() {
		return pInfo;
	}

	public void setpInfo(String pInfo) {
		this.pInfo = pInfo;
	}

	public int getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}

}
