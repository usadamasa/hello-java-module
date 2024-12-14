package org.example.myapp;

//import org.example.mymodule.imajava.hidden.HiddenGreeting;
import org.example.mymodule.imajava.mylib.Greeting;

public class Main {
    public static void main(String[] args) {
        String str = Greeting.hello("MYNAVI");
        System.out.println(str);

        // hidden package is not visible
        // String hiddenStr = HiddenGreeting.hello("MYNAVI");
    }
}