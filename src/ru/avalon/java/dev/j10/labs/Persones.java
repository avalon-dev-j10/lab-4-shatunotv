/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;



import java.util.Arrays;

import java.util.Date;

public class Persones implements Person {
 String name;
 Date birthday;
  
   
    String[] strings = {"9","2","3","5","6","7","8","1","4","10","12","11","13",
        "15","14","17","16","18","20","19"};
    
public Persones(String name, Date birthday) {
 this.name = name;
 this.birthday = birthday;
     
     
    Persones [] persons = new Persones[20];
     
      // persons [i] = new Persones (String name, Date birthday);
      

        persons [0] = new Persones ("Иван", new Date (2001,11,01));
        persons [1] = new Persones ("Коля", new Date (2002,10,01));        
        persons [2] = new Persones ("Миша", new Date (2003,10,01));         
        persons [3] = new Persones ("Вася", new Date (2004,10,01));         
        persons [4] = new Persones ("Коля", new Date (2005,10,01));         
        persons [5] = new Persones ("Коля", new Date (2006,10,01));        
        persons [6] = new Persones ("Коля", new Date (2007,10,01)); 
        persons [7] = new Persones ("Коля", new Date (2008,10,01)); 
        persons [8] = new Persones ("Коля", new Date (2009,10,01)); 
        persons [9] = new Persones ("Коля", new Date (2010,01,01)); 
        persons [1] = new Persones ("Коля", new Date (2002,10,01));        
        persons [2] = new Persones ("Миша", new Date (2003,10,01));         
        persons [3] = new Persones ("Вася", new Date (2004,10,01));         
        persons [4] = new Persones ("Коля", new Date (2005,10,01));         
        persons [5] = new Persones ("Коля", new Date (2006,10,01));        
        persons [6] = new Persones ("Коля", new Date (2007,10,01)); 
        persons [7] = new Persones ("Коля", new Date (2008,10,01)); 
        persons [8] = new Persones ("Коля", new Date (2009,10,01)); 
        persons [9] = new Persones ("Коля", new Date (2010,04,01)); 
        persons [10] = new Persones ("Коля", new Date (2011,06,01)); 

        
        Arrays.sort(persons);
        
}  



    public Date getBirthday() {
        return birthday;
    }

        
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
    


  
                
}


