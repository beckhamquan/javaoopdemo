package com.truonglehungit.javacollection.list;

public class Student implements Comparable<Student> {
  private String name;
  private int id;
  private int studentAge;

  public Student(String name, int id, int age) {
    this.name = name;
    this.id = id;
    this.studentAge = age;
  }

  // getter and setter
  public String getStudentName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getStudentAge() {
    return studentAge;
  }

  public void setStudentName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setStudentAge(int studentAge) {
    this.studentAge = studentAge;
  }
  //compare b
  @Override
  public int compareTo(Student comparestu) {
    int compareage = ((Student) comparestu).getStudentAge();
    return this.studentAge - compareage;
    /* For Descending order do like this */
    //return compareage-this.studentAge;   
  }
  @Override
  public String toString() {
      return "[ id=" + id + ", name=" + name + ", age=" + studentAge + "]";
  }
}
