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
import java.lang.Iterable;


public class Comparatorreal implements Comparator{ 
    Comparatorreal Comparator = new Comparatorreal(); 
   


    public int compare(Persones o1, Persones o2) {
    return o1.getName().compareTo(o2.getName());}

    
    public Comparator reversed(Persones o1, Persones o2) {
     return Comparator.super.reversed();}

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   

}

   