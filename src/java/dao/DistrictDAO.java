/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.District;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Edison
 */
public class DistrictDAO {
        public List<District> getDistrictName(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<District> q=s.createQuery("select name from District").list();
        s.close();
        return q;
    }
}
