package com.truonglehungit.javacollection.set;

import java.util.LinkedHashSet;

public class SetLinkedHashSet {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    LinkedHashSet<String> lhset = new LinkedHashSet<String>();
 // Adding elements to the LinkedHashSet
    lhset.add("Z");
    lhset.add("PQ");
    lhset.add("N");
    System.out.println(lhset);  //[Z, PQ, N]
 // LinkedHashSet of Integer Type
    LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();
    // Adding elements
    lhset2.add(99);
    lhset2.add(7);
    lhset2.add(0);
    System.out.println(lhset2);  //[99, 7, 0]
  }

}
