/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;



public class Comparatorreal implements Comparator<Persones>{ 
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
        
        // Распределить по возрастанию возраста.
        int value = (int)(o1.getBirthDate().getTime() - o2.getBirthDate().getTime());
        if (value != 0) {
            return value;
        }
        // Если возраст равен, то сравнить fullName.
        // Сравнить по Alphabet (алфавиту).
        value = o1.getName().compareTo(o2.getName());
        return value;
    }

    
    public Comparator reversed(Persones o1, Persones o2) {
        return Comparator.super.reversed();
     
    }
}

class StringComparator implements Comparator<String> {
        
     public Comparator reversed(String p1, String p2) {
     return Comparator.super.reversed();
     }

    @Override
    public int compare(String o1, String o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<String> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<String> thenComparing(Comparator<? super String> other) {
        return Comparator.super.thenComparing(other); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <U> Comparator<String> thenComparing(Function<? super String, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<String> thenComparing(Function<? super String, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<String> thenComparingInt(ToIntFunction<? super String> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<String> thenComparingLong(ToLongFunction<? super String> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<String> thenComparingDouble(ToDoubleFunction<? super String> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor); //To change body of generated methods, choose Tools | Templates.
    }
} 