/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;



import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;

import java.util.Date;

public class Persones implements Person {
 String name;
 Date birthDate;
 
 
  //private static final SimpleDateFormat dateFormat 
     //              = new SimpleDateFormat("dd/MM/yyyy");
   
    String[] strings = {"9","2","3","5","6","7","8","1","4","10","12","11","13",
        "15","14","17","16","18","20","19"};
    
public Persones(String name, Date birthDate) {
 this.name = name;
 this.birthDate = birthDate;
     
     Persones [] persons = new Persones[20];
     
      //persons [i] = new Persones (String name, Date (birthDate));
      

        persons [0] = new Persones ("Иван", new Date((long)(12/02/2001)));
        persons [1] = new Persones ("Коля", new Date((long)(25/05/1999)));        
        persons [2] = new Persones ("Миша", new Date((long)(21/07/1984)));         
        persons [3] = new Persones ("Вася", new Date((long)(12/01/2004)));         
        persons [4] = new Persones ("Коля", new Date((long)(22/12/1896)));         
        persons [5] = new Persones ("Дима", new Date((long)(25/11/2002)));        
        persons [6] = new Persones ("John", new Date((long)(8/04/2012))); 
        persons [7] = new Persones ("Bill", new Date((long)(9/01/2014))); 
        persons [8] = new Persones ("Donald", new Date((long)(01/02/2011))); 
        persons [9] = new Persones ("Коля", new Date((long)(03/02/2013))); 
        persons [1] = new Persones ("Коля", new Date((long)(07/9/1997)));      
        persons [2] = new Persones ("Миша", new Date((long)(05/02/2001)));         
        persons [3] = new Persones ("Вася", new Date((long)(06/8/2000)));       
        persons [4] = new Persones ("Jack", new Date((long)(8/10/2001)));       
        persons [5] = new Persones ("Коля", new Date((long)(11/02/2008)));        
        persons [6] = new Persones ("Витя", new Date((long)(12/03/2006))); 
        persons [7] = new Persones ("Маша", new Date((long)(15/05/2004))); 
        persons [8] = new Persones ("Даша", new Date((long)(18/02/2003))); 
        persons [9] = new Persones ("Коля", new Date((long)(15/04/1995))); 
        persons [10] = new Persones ("Коля", new Date((long)(01/02/1996))); 

}  
     
    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return birthDate;
   }   

    
    
}


