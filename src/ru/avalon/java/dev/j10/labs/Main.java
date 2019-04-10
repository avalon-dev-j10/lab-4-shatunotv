package ru.avalon.java.dev.j10.labs;

import java.util.*;


public class Main {
      
    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */

//        String[] strings = new String[20];
        String[] strings = {"9","2","3","5","6","7","8","1","4","10","12","11","13",
        "15","14","17","16","18","20","19"};
            
        System.out.println("Несортированный массив строк " + Arrays.toString(strings));
            
        /*
	 * TODO(Студент): Проинициализируйте массив persons
	 *
	 * 1. Создайте класс, реализующий интерфейс Person.
	 *
	 * 2. Проинициализируйте массив persons 20
	 *    экземплярыми созданного класса.
	 */
        
        Persones [] persons = new Persones[19];
        int num = 0;
        persons [num++] = new Persones ("Иван", new Date("25/05/1999"));        
        persons [num++] = new Persones ("Миша", new Date("21/07/1984"));         
        persons [num++] = new Persones ("Вася", new Date("12/01/2004"));         
        persons [num++] = new Persones ("Коля", new Date("22/12/1896"));         
        persons [num++] = new Persones ("Дима", new Date("25/11/2002"));        
        persons [num++] = new Persones ("John", new Date("08/04/2012")); 
        persons [num++] = new Persones ("Bill", new Date("9/01/2014")); 
        persons [num++] = new Persones ("Donald", new Date("01/02/2011")); 
        persons [num++] = new Persones ("Коля", new Date("03/02/2013")); 
        persons [num++] = new Persones ("Коля", new Date("07/9/1997"));      
        persons [num++] = new Persones ("Миша", new Date("05/02/2001"));         
        persons [num++] = new Persones ("Вася", new Date("06/8/2000"));       
        persons [num++] = new Persones ("Jack", new Date("8/10/2001"));       
        persons [num++] = new Persones ("Коля", new Date("11/02/2008"));        
        persons [num++] = new Persones ("Витя", new Date("12/03/2006")); 
        persons [num++] = new Persones ("Маша", new Date("15/05/2004")); 
        persons [num++] = new Persones ("Даша", new Date("18/02/2003")); 
        persons [num++] = new Persones ("Коля", new Date("15/04/1995")); 
        persons [num++] = new Persones ("Коля", new Date("01/02/1996")); 
            
        System.out.println("Несортированный массив персон:");
        for (Person p: persons) {
            System.out.println(p.getName() + " " + p.getBirthDate().toLocaleString());
        }
            
        Sort sort = new Sortreal();
        
        sort.sort(persons);

        for (Persones s:persons){
            System.out.println("сортированный" + s);
        }
        
        sort.sort(strings);
        
        for (String g:strings){
            
            System.out.println("сортированный" + g);
        }
        sort.sort(persons, Collections.reverseOrder());
        
        for(int i = 0; i <  persons.length; i++){
            
            System.out.println("сортированный в обратную" + persons);
        }
        sort.sort(strings, Collections.reverseOrder());
        
        for (String h:strings){
            
            System.out.println("сортированный в обратную" + h);
        }    
	    
        /*  TODO(Замечания №1 ЛР№4)
            - Большую часть ЛР4 я тебе переделал, остальное давай САМ!!!!
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


