package com.truonglehungit.javaenum;



public class EnumDemo2 {
  
  public enum Directions2 {
    EAST, WEST, NORTH, SOUTH
  }

  Directions2 dir2;

  public EnumDemo2(Directions2 dir2) {
    this.dir2 = dir2;
  }

  public void getMyDirections() {
    switch (dir2) {
      case EAST:
        System.out.println("In East Direction");
        break;
      case WEST:
        System.out.println("In West Direction");
        break;

      case NORTH:
        System.out.println("In North Direction");
        break;

      default:
        System.out.println("In South Direction");
        break;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    EnumDemo2 obj1 = new EnumDemo2(Directions2.EAST);
    obj1.getMyDirections();
    EnumDemo2 obj2 = new EnumDemo2(Directions2.SOUTH);
    obj2.getMyDirections();
    // How to iterate through an Enum variable
    for (Directions2 dir : Directions2.values()) {
      System.out.println(dir);
    }
  }

  
}
