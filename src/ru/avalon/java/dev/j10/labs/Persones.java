package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class Persones implements Person {
    private String name;
    private Date birthDate;
 
    /*  TODO (Замечание№1 ЛР№4)
        - Инициализировать строки надо в Main!!
        Читай условия ЛР!!!
    */
    
    public Persones(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
     
    /*  TODO (Замечание№1 ЛР№4)
        - Инициализировать класс Persones надо  в Main!!
    */
}  
     
    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return birthDate;
   }   

    
    
}


