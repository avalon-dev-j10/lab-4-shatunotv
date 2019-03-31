/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author sany
 */
public class Sortto implements Sort {
    Sortto sort = new Sortto();
   // String[] strings = new String[20];
    //Persones [] persons = new Persones[20];
    
    public int sort(String[] strings) {
        
        Arrays.sort(strings);
        
    for(int i = 0; i <  strings.length; i++) {

    }
   return -1;
    }
  
  public int sort(Persones [] persons){
      
        Arrays.sort(persons);
        
             for(int j = 0; j <  persons.length; j++) {
   
    }
             return 1;

  }
   

    public int sort(String[] strings, Persones [] persons) {

    if (Arrays.equals(strings, strings)) 
        return 1;
    else
        return -1;
     
        if (Arrays.equals(persons, persons))
            return 1;
    else
            return -1;

   
         }
    
    
      
    
    public int compare(Person o1, Person o2) {
        if (o1.getBirthDate().before(o2.getBirthDate())) 
            return -1;
        else if (o1.getBirthDate().after(o2.getBirthDate()))
            return 1;
        else 
            return 0;

    
    public String[] sort(String[] strings, Comparatorreal Comparator) {
     
          return   
        }
        
    public String[] sort(Persones [] persons, Comparatorreal Comparator) {
     
          return   
        }

    @Override
    public void sort(Object[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort(Comparable[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    }
