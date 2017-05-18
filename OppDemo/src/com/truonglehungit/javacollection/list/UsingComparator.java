package com.truonglehungit.javacollection.list;
import com.truonglehungit.javacollection.list.Student2;
import java.util.ArrayList;
import java.util.Collections;

public class UsingComparator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<Student2> obj = new ArrayList<Student2>();
    obj.add(new Student2("hung1", 1112334, 30));
    obj.add(new Student2("hung2", 1112335, 34));
    obj.add(new Student2("hung3", 1112336, 18));
    //sorting by student name
    Collections.sort(obj,Student2.StuNameComparator);
    System.out.println("sorting by student name");
    for (Student2 stu : obj) {
      System.out.println(stu);
    }
    //sorting by student id
    Collections.sort(obj,Student2.StuId);
    System.out.println("sorting by student id");
    for(Student2 stu:obj){
      System.out.println(stu); 
    }
  }

}
