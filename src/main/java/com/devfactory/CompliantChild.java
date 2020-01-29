package com.devfactory;

import java.util.Optional;

public class CompliantChild extends Parent {

    private Integer findSdlcSystem(Integer system) {
        System.out.println(system);

        return system + 2_000_000;
    }

    private Optional<String> findSdlcSystem(String systemUrl) {
        return Optional.ofNullable(systemUrl);
    }


    public static void main(String[] args) {
        CompliantChild compliantChild = new CompliantChild();
        System.out.println(compliantChild.findSdlcSystem(1));
        System.out.println(compliantChild.findSdlcSystem("system"));
    }
}
