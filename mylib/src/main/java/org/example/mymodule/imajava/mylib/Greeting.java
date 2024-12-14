package org.example.mymodule.imajava.mylib;


import org.example.mymodule.imajava.hidden.HiddenGreeting;

public class Greeting {
    public static String hello(String name) {
        String s = new HiddenGreeting().hello(name);
        return "(Exports Module) -> " + s;
    }
}
