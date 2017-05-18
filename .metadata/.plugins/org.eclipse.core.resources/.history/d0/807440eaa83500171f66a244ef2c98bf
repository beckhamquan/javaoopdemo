package com.truonglehungit.javaenum;


public class EnumFieldsMethod {
  
  public enum Directions{
    EAST ("E"), 
    WEST ("W"), 
    NORTH ("N"), 
    SOUTH ("S") ; 
    /* Important Note: Must have semicolon at
     * the end when there is a enum field or method
     */
    private final String shortCode;
        
    Directions(String code) {
        this.shortCode = code;
    }
        
    public String getDirectionCode() {
        return this.shortCode;
    }
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Directions dir = Directions.SOUTH;
    System.out.println(dir.getDirectionCode());
    Directions dir2 = Directions.EAST;
    System.out.println(dir2.getDirectionCode());
  }

}
