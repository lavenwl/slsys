/** 
 * Project Name:slsys 
 * File Name:UserServiceImpl.java 
 * Package Name:com.sl.base.user.service.impl 
 * Date:2016年10月9日下午3:37:45 
 * Copyright (c) 2016, laven_wang@126.com All Rights Reserved. 
 * 
*/  
  
package com.sl.base.user.service.impl;  

import java.util.List;

import com.sl.base.entity.hibernate.BaseUser;
import com.sl.base.role.service.RoleService;
import com.sl.base.user.dao.UserDao;
import com.sl.base.user.service.UserService;
import com.sl.global.entity.QueryBean;
import com.sl.global.service.impl.BaseServiceImpl;

/** 
 * ClassName:UserServiceImpl <br/> 
 * Function: 用户功能应用层 <br/> 
 * Reason:   用户相关功能具体业务逻辑类 <br/> 
 * Date:     2016年10月9日 下午3:37:45 <br/> 
 * @author   laven 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class UserServiceImpl implements UserService{
	private UserDao userDao;
	private RoleService roleService;
	@Override
	public List<BaseUser> list() {
		return userDao.queryUsingAll();
	}
	
	@Override
	public List<BaseUser> query(QueryBean queryUserBean) {
		return userDao.queryByQueryBean(queryUserBean);
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public BaseUser queryById(long id) {
		return userDao.queryById(id);
	}

	@Override
	public int deleteById(long id) {
		BaseUser baseUser = queryById(id);
		baseUser.setState(0);
		userDao.update(baseUser);
		return 1;
	}

	@Override
	public int save(BaseUser baseUser) {
		Long id = baseUser.getBaseRole().getId();
		//处理内部bean对象
		baseUser.setBaseRole(roleService.queryById(baseUser.getBaseRole().getId()));
		userDao.save(baseUser);
		return 1;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public int update(BaseUser baseUser) {
		Long id = baseUser.getBaseRole().getId();
		//处理内部bean对象
		baseUser.setBaseRole(roleService.queryById(baseUser.getBaseRole().getId()));
		userDao.update(baseUser);
		return 1;
	}


}
  