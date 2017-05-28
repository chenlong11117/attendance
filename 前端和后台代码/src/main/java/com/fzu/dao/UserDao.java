package com.fzu.dao;

import org.apache.ibatis.annotations.Param;

import com.fzu.model.Student;

/** 
 * ���ܸ�Ҫ��User��DAO�� 
 *  
 * @author linbingwen 
 * @since 2015��9��28�� 
 */  
public interface UserDao {  
    /** 
     *  
     * @author linbingwen 
     * @since 2015��9��28�� 
     * @param userId 
     * @return 
     */  
    public Student selectUserById(@Param("sID")String sID,@Param("spwd")String password);  
  
}  
