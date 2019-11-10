package com.jarvis.base.utils;

public class VOTest {

	private String id;
	private String name;
	private String remark;
	private String amount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "VOTest [id=" + id + ", name=" + name + ", remark=" + remark + ", amount=" + amount + "]";
	}
	public VOTest(String id, String name, String remark, String amount) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
		this.amount = amount;
	}
	
}
