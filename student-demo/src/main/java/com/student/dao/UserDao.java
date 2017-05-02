package com.student.dao;


import com.student.bean.User;
import com.student.common.persistence.HibernateDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;


/**
 * @author: wuchao
 * @date： 2017/5/2
 */
@Repository
public class UserDao extends HibernateDao<User,Long> {

    public boolean findUserByNameAndPass(String name, String pass) {

        Query query = getSession().createQuery("select u.name from User u where u.name = '" + name +
                        "'" + " and u.password =  " + " '" + pass + "' ");

        return query.list().isEmpty();


    }

}
