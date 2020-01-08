package com.class35;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveAll {
//create a map of a person(name, last name address, city, state)
	public static void main(String[] args) {
		
	
	Map<String, String> personMap=new LinkedHashMap<>();
	personMap.put("Name","Jessica");
	personMap.put("LastName", "Cabrera");
	personMap.put("Address", "5601 Magnolia Ln");
	personMap.put("City","Alexandria");
	personMap.put("State", "VA");
	
	System.out.println(personMap);
	String value=personMap.get("State");
	System.out.println(value);
	
	//how to retreive all keys and values?
	System.out.println("-------PRINTING ALL KEYS------------");
	
	Set<String> keys=personMap.keySet();
	for (String key:keys) {
		System.out.println(key);
	}
	Iterator<String> keysIterator=keys.iterator();
	while(keysIterator.hasNext()) {
		System.out.println(keysIterator.next());
	}
	System.out.println("-------PRINTING ALL VALUES------------");
	Collection<String> values=personMap.values();

	for(String val:values) {
		System.out.println(val);
	}
	Iterator<String> valuesIterator=values.iterator();
	while(valuesIterator.hasNext()) {
		System.out.println(valuesIterator.next());
	}
	Iterator<String> keyIter=keys.iterator();
	while(keyIter.hasNext()) {
		String key=keyIter.next();
		
		System.out.println(key+" "+personMap.get(key));
	}
	
}
}