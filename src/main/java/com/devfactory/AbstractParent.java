package com.devfactory;

public abstract class AbstractParent {

    public void overrideMeCompliantly(){
        System.out.println(123);
    }

    public void doNotoverrideMeCompliantly(){
        System.out.println(321);
    }

}
