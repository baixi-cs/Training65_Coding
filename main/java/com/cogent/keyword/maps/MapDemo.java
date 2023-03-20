package com.cogent.keyword.maps;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class: TreeMap HashTable HashMap
		//not synchronized--HashMap TreeMap
		//synchronized--HashTable
		
		
		HashMap<Integer, String> hminfo = new HashMap <Integer, String> ();
		hminfo.put(1, "AAmap");
		hminfo.put(2, "BBmap");
		hminfo.put(10, "eemap");
		hminfo.put(1123, "ddmap");
		hminfo.put(191, "ccmap");
		
		System.out.println(hminfo.remove(191));
		System.out.println(hminfo.put(1011,""));
		System.out.println(hminfo.put(145,""));
		System.out.println(hminfo.put(139,""));
		System.out.println(hminfo.put(0,"null"));
		System.out.println(hminfo);
		
		
		TreeMap<Integer, String> tminfo = new TreeMap <Integer, String> ();//ascend key order
		tminfo.put(19, "AAtree");
		tminfo.put(29, "BBtree");
		tminfo.put(109, "eereet");
		tminfo.put(11239, "ddtree");
		tminfo.put(1919, "cctree");
		System.out.println(tminfo.remove(191));
		System.out.println(tminfo.put(1011,"fftree"));
		System.out.println(tminfo);
		
		Hashtable <Integer, String> htinfo = new Hashtable <Integer, String> ();
		htinfo.put(19, "AAtable");
		htinfo.put(29, "BBtable");
		htinfo.put(109, "eetable");
		htinfo.put(11239, "ddtable");
		htinfo.put(1919, "cctable");
		System.out.println(htinfo);
		
		LinkedHashMap<Integer, String> lhminfo = new LinkedHashMap <Integer, String> ();
		lhminfo.put(1, "AAlinked");
		lhminfo.put(2, "BBlinked");
		lhminfo.put(10, "eelinked");
		lhminfo.put(1123, "ddlinked");
		lhminfo.put(191, "cclinked");
		System.out.println(lhminfo);
		
		System.out.println("*****************itr linked hash map");
		Iterator<Map.Entry<Integer, String>> itr =lhminfo.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> item = itr.next();
			System.out.println("key = "+ item.getKey()+ ", val = "+ item.getValue());
		}
		
		System.out.println("***************** for each itr hash table");
		for (Map.Entry<Integer, String> mapElement : htinfo.entrySet()) {
            int key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            String value = mapElement.getValue();
 
            // Printing above marks corresponding to
            // students names
            System.out.println(key + " : " + value);
        }
		
		System.out.println("***************** itr tree map");
		Iterator <Map.Entry<Integer, String>> itr2 = tminfo.entrySet().iterator();
		while(itr2.hasNext()) {
			Map.Entry<Integer, String> item = itr2.next();
			System.out.println("key = "+ item.getKey()+ ", val = "+ item.getValue());
					
		}
		
		System.out.println("***************** for each itr hash map");
		for (Map.Entry<Integer, String> item: hminfo.entrySet()) {
			 int key = item.getKey();
			 String value = item.getValue();
			 System.out.println(key + " : " + value);
			 
		}


	}

}
