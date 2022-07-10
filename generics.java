package com.bridge.labzs;

import static java.lang.Math.max;

public class generics {    public Integer testMaxium(Integer x, Integer y, Integer z) {
    Integer max = x;
    if(y.compareTo(max)>0){
        max = y;
    }
    if(z.compareTo(max)>0){
        max = z;
    }
    return max;
}
    public Float testMaxium(Float x, Float y, Float z) {
        Float max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}   public String testMaxium(String x, String y, String z) {
    String max = x;
    if(y.compareTo(max)>0){
        max = y;
    }
    if(z.compareTo(max)>0){
        max = z;
    }
    return max;
}public class GenericClass<T extends Comparable <T>> {
    public void testMaxium(T... n) {
        Integer i=0;
        T max = n[i];
        for (T a:n) {
            if (n[i].compareTo(max) > 0)
                max = n[i];
            i++;
        }
        System.out.println("The maximum Value is : "+max);
    }
}

}


}

