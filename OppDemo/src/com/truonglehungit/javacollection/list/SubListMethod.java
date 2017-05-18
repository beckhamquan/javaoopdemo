package com.truonglehungit.javacollection.list;

import java.util.ArrayList;
import java.util.List;

public class SubListMethod {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<String> al = new ArrayList<String>();

    //Addition of elements in ArrayList
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("D");
    al.add("E");
    al.add("F");
    System.out.println("Original ArrayList Content: "+al); //[A, B, C, D, E, F]
    //Sublist to ArrayList
    ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4)); //[B, C, D]
    System.out.println("SubList stored in ArrayList: "+al2);
    //Sublist to List
    List<String> list = al.subList(1, 4);
    System.out.println("SubList stored in List: "+list);//[B, C, D]

  }

}