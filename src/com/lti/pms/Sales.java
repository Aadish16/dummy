package com.lti.pms;

public class Sales {
	private int billNo ;
	private int prodId;
	private int qty;
	private int total;
	
	public Sales (int billNo , int prodId , int qty, int total) {
		this.setBillNo(billNo);
		this.setProdId(prodId);
		this.setTotal(total);
		this.setQty(qty);
	}
	
	public Sales() {
		// TODO Auto-generated constructor stub
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}



}

