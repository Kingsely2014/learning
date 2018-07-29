package com.dao;

import com.dao.impl.EmployeerDaoImpl;
import com.pojo.Employeer;
import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-07-25
 **/
public class EmployeerMapperTest {

    @Test
    public void countByExample() {
        IemployeerDao dao = new EmployeerDaoImpl();
        Employeer employeer = dao.selectByPrimaryKey(1);
        System.out.println(employeer.getEmployeerName());
    }

    @Test
    public void deleteTest() {
        IemployeerDao dao = new EmployeerDaoImpl();
        int result = dao.deleteByPrimaryKey(1);
        System.out.println(result);
    }
}