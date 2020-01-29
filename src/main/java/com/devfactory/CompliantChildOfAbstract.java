package com.devfactory;

public class CompliantChildOfAbstract extends AbstractParent {

    @VisibleForTesting
    @Override
    public void overrideMeCompliantly() {
        super.overrideMeCompliantly();
    }

    public static void main(String[] args) {
        CompliantChildOfAbstract child = new CompliantChildOfAbstract();
        child.overrideMeCompliantly();
    }
}
