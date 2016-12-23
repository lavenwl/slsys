package com.sl.wholesale.entity.hibernate;

// Generated 2016-12-23 16:52:56 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sl.global.entity.BaseEntity;

/**
 * GoodsType generated by hbm2java
 */
public class GoodsType extends BaseEntity implements java.io.Serializable {

	private Long id;
	private String name;
	private Date createDate;
	private Date updateDate;
	private Integer state;
	private Set goodses = new HashSet(0);

	public GoodsType() {
	}

	public GoodsType(Date createDate, Date updateDate) {
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public GoodsType(String name, Date createDate, Date updateDate,
			Integer state, Set goodses) {
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.state = state;
		this.goodses = goodses;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}