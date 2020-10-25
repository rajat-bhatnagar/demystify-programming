package com.coding.businesslogic.lambdas;

public class TypeInference {
    public static void main(String[] args) {

        TypeCastIntegerToString str = Object::toString;
        System.out.println(str.getStringFromInteger(10));
    }

    interface TypeCastIntegerToString{
        String getStringFromInteger(Integer i);
    }
}
