package com.fzu.service;

import com.fzu.model.Student;  

  
/** 
 * ���ܸ�Ҫ��UserService�ӿ��� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
public interface UserService {  
    Student selectUserById(String sID,String password);  
  
}  