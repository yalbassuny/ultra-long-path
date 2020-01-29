package com.devfactory;

public class SwitchCheck {

    private void compliant(String a) {
        switch (a) {
            case "asd":
                System.out.println("I am compliant");
                break;
            case "psd":
                System.out.println("I am compliant two");
                break;
            default:
                System.out.println("I am compliant default");
                break;
        }
    }

    private void incompliant(String b) {
        switch (b) {
            case "asd":
                System.out.println("I am compliant");
                break;
            case "psd":
                System.out.println("I am compliant two");
                break;
        }

    }

    private void emptyDefault(String c) {
        switch (c) {
            case "asd":
                System.out.println("I am compliant");
                break;
            case "psd":
                System.out.println("I am compliant two");
                break;
            default:
                break;
        }
    }

    private void commentedDefault(String c) {
        switch (c) {
            case "asd":
                System.out.println("I am compliant");
                break;
            case "psd":
                System.out.println("I am compliant two");
                break;
            default:
                // No other actions expected
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println(1);
        SwitchCheck switchCheck = new SwitchCheck();

        switchCheck.compliant(args[0]);
        switchCheck.incompliant(args[0]);
        switchCheck.emptyDefault(args[0]);
        switchCheck.commentedDefault(args[0]);
    }

}
