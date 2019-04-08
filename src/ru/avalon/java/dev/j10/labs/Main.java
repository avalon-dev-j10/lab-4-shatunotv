package ru.avalon.java.dev.j10.labs;

import java.util.*;


public class Main {
   // String[] strings = null;
    //Person[] persons = null;
   // Sort sort = null;
   // Comparator comparator = null;
    
    public static void main(String[] args) {
        

        String[] strings = new String[20];
            
            System.out.println("несортированный" + Arrays.toString(strings));
            
        Persones [] persons = new Persones[20];
            
            System.out.println("несортированный" + Arrays.toString(persons));
            
            
        Arrays.sort(persons, new Comparatorreal<Persones>());

        for (Persones s:persons){
            System.out.println("сортированный" + s);
        }
        
        Arrays.sort(strings);
        
        for (String g:strings){
            
            System.out.println("сортированный" + g);
        }
        Arrays.sort(persons, Collections.reverseOrder());
        
        for(int i = 0; i <  persons.length; i++){
            
            System.out.println("сортированный в обратную" + persons);
        }
        Arrays.sort(strings, Collections.reverseOrder());
        
        for (String h:strings){
            
            System.out.println("сортированный в обратную" + h);
        }    
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    

            
            
            

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        //sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        //sort.sort(strings, comparator);
    }
}


