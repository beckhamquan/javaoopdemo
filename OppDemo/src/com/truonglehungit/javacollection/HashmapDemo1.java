package com.truonglehungit.javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo1 {
	public static void main(String[] args){
		//declare hasmap
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		/* adding element into hashmap*/
		hmap.put(03, "Hà Nội");
		hmap.put(60, "Đồng Nai");
		hmap.put(50, "Tp HCM");
		//display  hashmap using iterator
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();  //is.exist display
			System.out.println("key is " +mentry.getKey() + ",Value is :"+mentry.getValue());
		}
		//get value base on key
		String var = hmap.get(50);
		System.out.println("key 50 is: "+var);
		// remove value base on key
		hmap.remove(60);
		
		Set set2 = hmap.entrySet();
		Iterator iterator2 =set2.iterator();
		System.out.println("element after remove : ");
		while(iterator2.hasNext()){
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.println(mentry2.getKey()+ ","+mentry2.getValue());
		}
		
	}
}
