package com.mamitang.dao;

import com.mamitang.DaoMaster;
import com.mamitang.entity.UserEntity;

@DaoMaster
public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserEntity selectByUserName(String userName, String passWord);
}