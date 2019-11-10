package com.jarvis.base.utils;

public class VOTest22 {

	private String idIN;
	private String nameIN;
	private String idOUT;
	private String nameOUT;
	private String remark;
	private String amount;
	public String getIdIN() {
		return idIN;
	}
	public void setIdIN(String idIN) {
		this.idIN = idIN;
	}
	public String getNameIN() {
		return nameIN;
	}
	public void setNameIN(String nameIN) {
		this.nameIN = nameIN;
	}
	public String getIdOUT() {
		return idOUT;
	}
	public void setIdOUT(String idOUT) {
		this.idOUT = idOUT;
	}
	public String getNameOUT() {
		return nameOUT;
	}
	public void setNameOUT(String nameOUT) {
		this.nameOUT = nameOUT;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public VOTest22(String idIN, String nameIN, String idOUT, String nameOUT, String remark, String amount) {
		super();
		this.idIN = idIN;
		this.nameIN = nameIN;
		this.idOUT = idOUT;
		this.nameOUT = nameOUT;
		this.remark = remark;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "idIN=" + idIN + ", nameIN=" + nameIN + ", idOUT=" + idOUT + ", nameOUT=" + nameOUT
				+ ", remark=" + remark + ", amount=" + amount;
	}
	
}
