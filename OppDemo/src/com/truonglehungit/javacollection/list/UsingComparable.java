package com.truonglehungit.javacollection.list;

import com.truonglehungit.javacollection.list.Student;
import java.util.ArrayList;
import java.util.Collections;
/*
 * sort class student by implements Comparable
 * 
 */
public class UsingComparable {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<Student> obj = new ArrayList<Student>();
    obj.add(new Student("hung1", 1112334, 30));
    obj.add(new Student("hung2", 1112335, 34));
    obj.add(new Student("hung3", 1112336, 18));

    Collections.sort(obj);
    for (Student stu : obj) {
      System.out.println(stu);
    }
  }

}
