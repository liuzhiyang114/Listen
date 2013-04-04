package cn.smartlab.map;

public class UserInfo {

	private String cardNo;
	private String password;
	private String moneySum;// �˻����
	private String uName;
	private String tel;
	private String sn; // ���֤

	public UserInfo() {
		super();
	}

	public UserInfo(String cardNo, String password, String moneySum,
			String uName, String tel, String sn) {
		super();
		this.cardNo = cardNo;
		this.password = password;
		this.moneySum = moneySum;
		this.uName = uName;
		this.tel = tel;
		this.sn = sn;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMoneySum() {
		return moneySum;
	}

	public void setMoneySum(String moneySum) {
		this.moneySum = moneySum;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

}
