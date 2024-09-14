/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter10.ch10assignment;

/**
 *
 * @author Elite
 */
public class Ch10Assignment { //this was one of the most fun assignments to date

    public static void main(String[] args) {
        Person[] people = new Person[4];
        
        people[0] = new Person("Umar Afolami", 
                "6823745260", "uafolami1@collin.edu");
        people[1] = new Person("Professor Poopy Butthole", 
                "6823745000", "prfp00pyb@rickandmorty.com");
        people[2] = new Employee("Randy Orton", 
                "6824445000", "viperstrikessoon@wwe.com", "101");
        people[3] = new Employee("Daenerys Targaryen", 
                "6823747777", "theprincethatwaspromised@westeros.com", "102");
        
        for (Person aPerson: people) {
            System.out.println(aPerson.toString());
            System.out.println();
        }
    }
}
