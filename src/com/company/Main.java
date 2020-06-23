package com.company;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Scooby-doo");


        System.out.println("================================================================");
        System.out.println("Information about class name: "+animal.getClass().getSimpleName());
        System.out.println("================================================================");
        System.out.println("Class fields: ");
        System.out.println(Arrays.toString(animal.getClass().getDeclaredFields()));
        System.out.println("================================================================");
        System.out.println("Class constructor: ");
        System.out.println(Arrays.toString(animal.getClass().getDeclaredConstructors()));
        System.out.println("================================================================");
        System.out.println("Class methods: ");
        System.out.println(Arrays.toString(animal.getClass().getDeclaredMethods()));
        System.out.println("================================================================");
    }

}
