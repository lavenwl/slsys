package com.sl.wholesale.entity.hibernate;

// Generated 2016-12-30 16:19:21 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sl.global.entity.BaseEntity;

/**
 * Order generated by hbm2java
 */
public class Order extends BaseEntity implements java.io.Serializable {

	private Long id;
	private UserInfo userInfoByPurchase;
	private UserInfo userInfoBySale;
	private double sumMoney;
	private double money;
	private Date createDate;
	private Date updateDate;
	private Integer state;
	private Set items = new HashSet(0);

	public Order() {
	}

	public Order(Date createDate, Date updateDate) {
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Order(UserInfo userInfoByPurchase, UserInfo userInfoBySale,
			double sumMoney, double money, Date createDate, Date updateDate,
			Integer state, Set items) {
		this.userInfoByPurchase = userInfoByPurchase;
		this.userInfoBySale = userInfoBySale;
		this.sumMoney = sumMoney;
		this.money = money;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.state = state;
		this.items = items;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserInfo getUserInfoByPurchase() {
		return this.userInfoByPurchase;
	}

	public void setUserInfoByPurchase(UserInfo userInfoByPurchase) {
		this.userInfoByPurchase = userInfoByPurchase;
	}

	public UserInfo getUserInfoBySale() {
		return this.userInfoBySale;
	}

	public void setUserInfoBySale(UserInfo userInfoBySale) {
		this.userInfoBySale = userInfoBySale;
	}

	public double getSumMoney() {
		return this.sumMoney;
	}

	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Set getItems() {
		return this.items;
	}

	public void setItems(Set items) {
		this.items = items;
	}

}
