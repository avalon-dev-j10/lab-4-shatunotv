/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;



public class Comparatorreal<Persones> implements Comparator<Persones>{ 
   Comparatorreal Comparator = new Comparatorreal(); 
   


    public int compare(Persones o1, Persones o2) {
    
    
            // Два объекта null считаются равными.
        if (o1 == null && o2 == null) {
            return 0;
        }
        // Если o1 является null, считается что o2 больше
        if (o1 == null) {
            return -1;
        }
        // Если o2 является null, считается что o1 больше.
        if (o2 == null) {
            return 1;
        }
        // Правило:
        // Распределить по возрастанию возраста.
        int value = o1.getBirthDate() - o2.getBirthDate();
        if (value != 0) {
            return value;
        }
        // Если возраст равен, то сравнить fullName.
        // Сравнить по Alphabet (алфавиту).
        value = o1.getName().compareTo(o2.getName());
        return value;
    }

    
    public Comparator<Persones> reversed(Persones o1, Persones o2) {
     return Comparator.super.reversed();
     
    }
    public static class StringComparator<String> implements Comparator<String> {
        
     public Comparator reversed(String p1, String p2) {
     return Comparator.super.reversed();
     }

     
    }  
    
}



   



   