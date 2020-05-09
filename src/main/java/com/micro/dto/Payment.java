package com.micro.dto;



public class Payment {

	private String paymentId;
	private String CustomerName;
	private String tranxDate;
	private String status;
	private String statusReason;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getTranxDate() {
		return tranxDate;
	}
	public void setTranxDate(String tranxDate) {
		this.tranxDate = tranxDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	public Payment(String paymentId, String customerName, String tranxDate, String status, String statusReason) {
		super();
		this.paymentId = paymentId;
		CustomerName = customerName;
		this.tranxDate = tranxDate;
		this.status = status;
		this.statusReason = statusReason;
	}
	
}
