package com.sl.base.entity.hibernate;

// Generated 2016-10-27 14:31:25 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BaseRole generated by hbm2java
 */
public class BaseRole implements java.io.Serializable {

	private long id;
	private String name;
	private Date createDate;
	private Date updateDate;
	private Integer state;
	private Set baseUsers = new HashSet(0);

	public BaseRole() {
	}

	public BaseRole(long id, String name, Date createDate, Date updateDate) {
		this.id = id;
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public BaseRole(long id, String name, Date createDate, Date updateDate,
			Integer state, Set baseUsers) {
		this.id = id;
		this.name = name;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.state = state;
		this.baseUsers = baseUsers;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public Set getBaseUsers() {
		return this.baseUsers;
	}

	public void setBaseUsers(Set baseUsers) {
		this.baseUsers = baseUsers;
	}

}