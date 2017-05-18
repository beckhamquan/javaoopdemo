package com.truonglehungit.javaenum;

public class EnumDemo1 {

  public enum Direction {
    EAST, WEST, NORTH, SOUTH
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Direction dir = Direction.NORTH;
    if (dir == Direction.EAST) {
      System.out.println("Direction: East");
    } else if (dir == Direction.WEST) {
      System.out.println("Direction: West");
    } else if (dir == Direction.NORTH) {
      System.out.println("Direction: North");
    } else {
      System.out.println("Direction: South");
    }
  }

}
