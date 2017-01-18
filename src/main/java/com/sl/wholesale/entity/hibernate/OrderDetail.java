package com.sl.wholesale.entity.hibernate;

// Generated 2017-1-9 19:54:26 by Hibernate Tools 4.0.0

import java.util.Date;

import com.sl.global.entity.BaseEntity;

/**
 * OrderDetail generated by hbm2java
 */
public class OrderDetail extends BaseEntity implements java.io.Serializable {

	private Long id;
	private Goods goods;
	private Order order;
	private SaleMode saleMode;
	private String orderDetailCode;
	private Integer num;
	private double price;
	private double sumMoney;
	private double money;
	private Date createDate;
	private Date updateDate;
	private Integer state;

	public OrderDetail() {
	}

	public OrderDetail(Date createDate, Date updateDate) {
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public OrderDetail(Goods goods, Order order, SaleMode saleMode,
			String orderDetailCode, Integer num, double price, double sumMoney,
			double money, Date createDate, Date updateDate, Integer state) {
		this.goods = goods;
		this.order = order;
		this.saleMode = saleMode;
		this.orderDetailCode = orderDetailCode;
		this.num = num;
		this.price = price;
		this.sumMoney = sumMoney;
		this.money = money;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.state = state;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public SaleMode getSaleMode() {
		return this.saleMode;
	}

	public void setSaleMode(SaleMode saleMode) {
		this.saleMode = saleMode;
	}

	public String getOrderDetailCode() {
		return this.orderDetailCode;
	}

	public void setOrderDetailCode(String orderDetailCode) {
		this.orderDetailCode = orderDetailCode;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
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

}