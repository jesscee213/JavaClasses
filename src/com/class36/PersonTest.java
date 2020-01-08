package com.class36;



	import java.util.Iterator;
	import java.util.TreeMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;
	class Person{
	    /*
	     * Create a Person class with following private fields: name, lastName, 
	     * age, salary. 
	     * Variables should be initialized through constructor.
	     * Inside the class also create a method to print user details.
	     * In Test Class create a Map that will store key in ascending order.
	     * In that map store personId and a Person Object. Print each object details.
	     */
	    
	    String name, lastName;
	    int age, salary;
	    public Person(String name, String lastName, int age, int Salary) {
	        this.name=name;
	        this.lastName=lastName;
	        this.age=age;
	        this.salary=salary;
	    }
	    public void userDetails() {
	        System.out.println("Name:"+name+"  Last name:"+lastName+"\n Age:"+age+"     Salary:"+salary+"\n");
	    }
	}
	public class PersonTest {
	    public static void main(String[] args) {
	        Map<Integer, Person> mapPerson=new TreeMap<>();
	        mapPerson.put(121, new Person("Jessica","Cabrera", 25, 375000));
	        mapPerson.put(342, new Person("Beyonce","Knowles", 24, 62000));
	        mapPerson.put(786, new Person("Enrique","Iglesias", 28, 83000));
	        mapPerson.put(123, new Person("Alicia","Keys", 35, 62000));
	        mapPerson.put(253, new Person("Michael","Scott", 32, 76000));
	        
	        Set<Entry<Integer, Person>> personEntrySet=mapPerson.entrySet();
	        for(Entry<Integer, Person> entry:personEntrySet) {
	            int i=entry.getKey();
	            Person person=entry.getValue();
	            System.out.print(entry.getKey()+"-->");
	            person.userDetails();
	        }
	        System.out.println("----ITERATOR----");
	        Iterator<Entry<Integer, Person>> entryIterator=personEntrySet.iterator();
	        while(entryIterator.hasNext()) {
	            Entry<Integer, Person> entry=entryIterator.next();
	            int i=entry.getKey();
	            Person person=entry.getValue();
	            System.out.println(i+"==>");
	            person.userDetails();
	        }
	    }
	}
