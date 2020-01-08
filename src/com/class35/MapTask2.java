package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTask2 {
public static void main(String[] args) {
	Map<String, String> countryMap=new LinkedHashMap<>();
	countryMap.put("Peru","Lima");
	countryMap.put("Paris","France");
	countryMap.put("Cairo", "Egypt");
	countryMap.put("Aswan", "Jordan");
	
	System.out.println("------printing keys and values-------");
	Set<String> keys=countryMap.keySet();
	for (String key:keys) {
		System.out.println(key);
	}
	Iterator<String> keysIterator=keys.iterator();
	while(keysIterator.hasNext()) {
		System.out.println(keysIterator.next());
}
	System.out.println("-----printing all values-------");
Collection<String> values=countryMap.values();
	
	for(String val:values) {
		System.out.println(val);	
		
		Iterator<String> keyIter=keys.iterator();
		while(keyIter.hasNext()) {
			String key=keyIter.next();
			String mapValue=countryMap.get(key);
			System.out.println(key+" "+countryMap.get(key));
		}
	
}
}
}
