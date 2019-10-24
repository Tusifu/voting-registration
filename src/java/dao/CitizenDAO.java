/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Citizen;
import domain.District;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Edison
 */
public class CitizenDAO {

    public String Create(Citizen ct) {
        if (findById(ct.getNationalId()) != null) {
            return "fail to register because that National Id already registered";
        } else {
            try {
                Session s = HibernateUtil.getSessionFactory().openSession();
                s.beginTransaction();
                s.save(ct);
                s.getTransaction().commit();
                s.close();
                return "the citizen registered successfully";

            } catch (Exception e) {
                return "fail to register citizen";
            }
        }
    }

    public Citizen findById(String id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Citizen ct = (Citizen) s.get(Citizen.class, id);
        s.close();
        return ct;
    }
    
    public List<Citizen> findAll(){
    Session s = HibernateUtil.getSessionFactory().openSession();
    Query q=s.createQuery("from Citizen");
    List<Citizen> li=q.list();
    return li;       
    }   
}
