package com.tsp.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import java.util.Objects;


@Embeddable
public class AccountPk implements Serializable{
	private Integer accId;
	private String accType;
	private String holderName;
	
	public AccountPk(Integer accId, String accType, String holderName) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.holderName = holderName;
	}
	public AccountPk() {
		// TODO Auto-generated constructor stub
	}
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        AccountPk that = (AccountPk) o;
	        return Objects.equals(accId, that.accId) &&
	                Objects.equals(accType, that.accType) &&
	                Objects.equals(holderName, that.holderName);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(accId, accType, holderName);
	    }
	

}
