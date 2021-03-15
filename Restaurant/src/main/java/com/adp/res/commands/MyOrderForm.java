package com.adp.res.commands;

import java.io.Serializable;

public class MyOrderForm implements Serializable {

	private static final long serialVersionUID = 129865321L;
	private Long id;
	private String customerName;
	private String customerPhone;
	private Long[] appId;
	private Long[] bevId;
	private Long[] entrId;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Long[] getAppId() {
		return appId;
	}

	public void setAppId(Long[] appId) {
		this.appId = appId;
	}

	public Long[] getBevId() {
		return bevId;
	}

	public void setBevId(Long[] bevId) {
		this.bevId = bevId;
	}

	public Long[] getEntrId() {
		return entrId;
	}

	public void setEntrId(Long[] entrId) {
		this.entrId = entrId;
	}


}