package com.fzu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fzu.dao.UserDao;
import com.fzu.model.Student;  
  
  
/** 
 * ���ܸ�Ҫ��UserServiceʵ���� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
@Service  
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;  
  
    
	@Override
	public Student selectUserById(String username, String password) {
		return userDao.selectUserById(username,password); 
	}  
  
}  
