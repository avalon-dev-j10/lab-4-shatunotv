/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author sany
 */
public class Sortreal implements Sort {
  

    @Override
    public void sort(Object[] array) {
    
    }

    @Override
    public void sort(Comparable[] array) {
   
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
       
}




}
    
    
    
    

   
/*
//реализуем метод compareTo интерфейса Comparable
    public int compareTo(User o) {

//используем метод compareTo из класса String для сравнения имен
        int result = this.name.compareTo(o.name);

//если имена одинаковые -  сравниваем возраст,
используя метод compareTo из класса Integer

        if (result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }
*/