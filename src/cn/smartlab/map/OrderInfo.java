package cn.smartlab.map;

public class OrderInfo {

	private String ordNo;// ������
	private String cardNo;
	private String parkNo;
	private String schNo;// �ײͺ�
	private String startDate;
	private String endDate;
	private String realDate;

	public OrderInfo() {
		super();
	}

	public OrderInfo(String ordNo, String cardNo, String parkNo, String schNo,
			String startDate, String endDate, String realDate) {
		super();
		this.ordNo = ordNo;
		this.cardNo = cardNo;
		this.parkNo = parkNo;
		this.schNo = schNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.realDate = realDate;
	}

	public String getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getParkNo() {
		return parkNo;
	}

	public void setParkNo(String parkNo) {
		this.parkNo = parkNo;
	}

	public String getSchNo() {
		return schNo;
	}

	public void setSchNo(String schNo) {
		this.schNo = schNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRealDate() {
		return realDate;
	}

	public void setRealDate(String realDate) {
		this.realDate = realDate;
	}

}
