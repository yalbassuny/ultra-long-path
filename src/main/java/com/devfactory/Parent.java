package com.devfactory;

import java.util.Optional;

public class Parent {

    private Integer findSdlcSystem(Integer system) {
        System.out.println(system);

        return system + 1_000_000;
    }

    private Optional<String> findSdlcSystem(String systemUrl) {
        return Optional.ofNullable(systemUrl);
    }

    public static void main(String[] args) {
        Parent compliantChild = new Parent();
        System.out.println(compliantChild.findSdlcSystem(1));
        System.out.println(compliantChild.findSdlcSystem("system"));
    }

}
