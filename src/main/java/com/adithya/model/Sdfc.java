package com.adithya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sdfc {
	
	@Id
	@Column(name="account_number")
	private int acc_no;
	private String name;
	@Column(name="password")
	private String psw;
	@Column(name="confirm_password")
	private String con_psw;
	@Column(name="amount")
	private double amt;
	@Column(name="address")
    private String addr;
	@Column(name="mobile_number")
	private long mno;
	public Sdfc() {
		super();
	}
	public Sdfc(int acc_no, String name, String psw, String con_psw, double amt, String addr, long mno) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.psw = psw;
		this.con_psw = con_psw;
		this.amt = amt;
		this.addr = addr;
		this.mno = mno;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getCon_psw() {
		return con_psw;
	}
	public void setCon_psw(String con_psw) {
		this.con_psw = con_psw;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	@Override
	public String toString() {
		return "Sdfc [acc_no=" + acc_no + ", name=" + name + ", psw=" + psw + ", con_psw=" + con_psw + ", amt=" + amt
				+ ", addr=" + addr + ", mno=" + mno + "]";
	}
	
	
}
