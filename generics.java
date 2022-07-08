package com.bridge.labzs;

import static java.lang.Math.max;

public class generics {
    private static Integer x;
    private static Integer y;
    private static Integer z;

    public static void main(String args[]) {
        public Integer testMaxium (Integer x, Integer y, Integer z){
            Integer max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }

            return max();
        }
    }
}



