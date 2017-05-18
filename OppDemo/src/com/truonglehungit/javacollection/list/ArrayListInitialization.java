package com.truonglehungit.javacollection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInitialization {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // Method 1: Initialization using Arrays.asList
    ArrayList<String> obj = new ArrayList<String>(Arrays.asList("TP.HCM", "Đồng Nai", "Sài gòn"));
    System.out.println(obj); // [TP.HCM, Đồng Nai, Sài gòn]
    // Method 2: Anonymous inner class method to initialize ArrayList
    ArrayList<String> obj2 = new ArrayList<String>() {
      {
        add("Bình Dương");
        add("cà mau");
      }
    };
    System.out.println(obj2);// [Bình Dương, cà mau]
    // Method3: Normal way of ArrayList initialization
    ArrayList<String> obj3 = new ArrayList<String>();
    obj3.add("Bình phước");
    obj3.add("Đắc lắc");
    System.out.println(obj3); // [Bình phước, Đắc lắc]
    // Method 4: Use Collections.ncopies
    ArrayList<Integer> obj4 = new ArrayList<Integer>(Collections.nCopies(3, 1) // 3 item value 1
    );
    System.out.println(obj4); // [1, 1, 1]
  }

}
