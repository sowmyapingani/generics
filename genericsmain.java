package com.bridge.labzs;

public class genericsmain {
    public static void main(String[] args) {
    System.out.println("Welcome1 to generics");
    //UC1 find maximum of three Integers
    GenericClass genericClass = new GenericClass();
    Integer printValue = genericClass.testMaxium(1,7,4);
    System.out.println("The Maximum integer is : "+printValue);
}

}
