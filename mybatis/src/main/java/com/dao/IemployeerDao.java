package com.dao;

import com.pojo.Employeer;

public interface IemployeerDao {
    int deleteByPrimaryKey(Integer employeerId);

    int insert(Employeer record);

    int insertSelective(Employeer record);

    Employeer selectByPrimaryKey(Integer employeerId);

    int updateByPrimaryKeySelective(Employeer record);

    int updateByPrimaryKey(Employeer record);
}