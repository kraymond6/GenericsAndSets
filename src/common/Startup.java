package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
        //(String lastName, String firstName, String ssn) {
        Employee e1 = new Employee("Smith", "John", "333-22-4444");
        Employee e2 = new Employee("Mueller", "Aiden", "666-44-8888");
        Employee e3 = new Employee("Doe", "Samantha", "111-22-3333");
        Employee e4 = new Employee("Raymond", "Kevin", "333-22-4444");
        
       HashMap<Employee, String> map1 = new HashMap<>();
       
       map1.put(e1, "333-22-4444");
       map1.put(e2, "666-44-8888");
       map1.put(e3, "111-22-3333");
       map1.put(e4, "333-22-4444");
       
       Set<Employee> keys = map1.keySet();
       for (Employee key : keys){
           System.out.println(key);
       }
       
    }
}
