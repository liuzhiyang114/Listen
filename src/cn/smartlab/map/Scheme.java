package cn.smartlab.map;

public class Scheme {

	private String schNo;
	private String schName;
	private String price;
	private String schInfo;

	public Scheme() {
		super();
	}

	public Scheme(String schNo, String schName, String price, String schInfo) {
		super();
		this.schNo = schNo;
		this.schName = schName;
		this.price = price;
		this.schInfo = schInfo;
	}

	public String getSchNo() {
		return schNo;
	}

	public void setSchNo(String schNo) {
		this.schNo = schNo;
	}

	public String getSchName() {
		return schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSchInfo() {
		return schInfo;
	}

	public void setSchInfo(String schInfo) {
		this.schInfo = schInfo;
	}

}
