/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author Edison
 */
public class MainClass {
    public static void main(String[] args) throws ParseException {
        
//        District district=new District();
//        district.setId("1");
//        district.setName("gasabo");
//        List<Citizen> li=new ArrayList<>();
//        district.setCitizen(li);
//        
//        Citizen ct=new Citizen();
        Date date=new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-27");
//        //Date d=new Date();
//                
//        long ms= (System.currentTimeMillis() - date.getTime());
//        long age= (long) (ms/(1000.0*60*60*24*365));    
//        System.out.println("your age is "+age);       
//        ct.setDateOfBirth(date);
//        ct.setDistrict(district);
//        ct.setFirstName("kalisa");
//        ct.setLastName("monica");
//        ct.setSex("monica");
//        ct.setNationalId("1");

//        new CitizenDAO().Create(ct);
           int currentYear = (date.getYear()+1900);
           
            
            boolean n=Pattern.matches("^1"+currentYear+".*", "92019u");
            
            if(n == true){
                System.out.println("you can now save");
            }else{
                System.out.println("please make sure incorrect national id that national id cant exist");
            
            }
    }
    
}
