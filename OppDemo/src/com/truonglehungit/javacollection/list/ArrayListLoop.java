package com.truonglehungit.javacollection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListLoop {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<Integer> obj = new ArrayList<Integer>();
    obj.add(15);
    obj.add(10);
    obj.add(25);
    //for loop
    for(int i=0;i<obj.size();i++ ){
      System.out.println(obj.get(i)); //display value 
    }
    //advanced loop
    System.out.println("Advanced loop: ");
    for(Integer num: obj){
      System.out.println(num);
    }
    //while loop
    int count =0;
    while(obj.size()>count){
      System.out.println(obj.get(count)); 
      count++;
    }
    //loop arraylist using iterator
    Iterator iter = obj.iterator();  //initilize a iterator
    while(iter.hasNext()){
      System.out.println(iter.next());
    }
    
    // iterate arraylist elements using Enumeration interface
    ArrayList<String> obj2 = new ArrayList<String>();
    obj2.add("C");
    obj2.add("C++");
    obj2.add("Java");
    obj2.add("DotNet");
    //get  the Enumeration object
    Enumeration <String> e= Collections.enumeration(obj2);
    System.out.println(obj2);  //[C, C++, Java, DotNet]  
    
    while(e.hasMoreElements()){
      System.out.println(e.nextElement());  //display item vertical
    }
    
  }

}
