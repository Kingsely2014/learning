package com.dao.impl;

import com.dao.IemployeerDao;
import com.pojo.Employeer;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author Kingsely
 * @create 2018-07-26
 **/
public class EmployeerDaoImpl implements IemployeerDao {
    private static Log logger = LogFactory.getLog(EmployeerDaoImpl.class);

    @Override
    public int deleteByPrimaryKey(Integer employeerId) {
        int result = 0;
        String resource = "config/mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            result = session.delete("deleteByPrimaryKey", 1);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insert(Employeer record) {
        return 0;
    }

    @Override
    public int insertSelective(Employeer record) {
        return 0;
    }

    @Override
    public Employeer selectByPrimaryKey(Integer employeerId) {
        Employeer emp = new Employeer();
        String resource = "config/mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            logger.info("---------------------test------------------------------");
            emp = session.selectOne("selectByPrimaryKey", employeerId);
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public int updateByPrimaryKeySelective(Employeer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Employeer record) {
        return 0;
    }
}
