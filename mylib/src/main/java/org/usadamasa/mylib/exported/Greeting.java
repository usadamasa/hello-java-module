package org.usadamasa.mylib.exported;


import org.usadamasa.mylib.hidden.HiddenGreeting;

public class Greeting {
    public static String hello(String name) {
        String s = new HiddenGreeting().hello(name);
        return "(Exports Module) -> " + s;
    }
}
