package com.truonglehungit.javacollection.set;

import java.util.HashSet;
/* does'n allows null element
 * do not allow duplicate element
 * allow null value element
 */
public class SetHasSet {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // HashSet declaration
    HashSet<String> hset = new HashSet<String>();

    // Adding elements to the HashSet
    hset.add("Apple");
    hset.add("Mango");
    hset.add("Grapes");
    // Addition of duplicate elements
    hset.add("Apple");
    hset.add("Mango");
    // Addition of null values
    hset.add(null);
    hset.add(null);

    // Displaying HashSet elements
    System.out.println(hset);   //[null, Apple, Grapes, Mango]

  }

}