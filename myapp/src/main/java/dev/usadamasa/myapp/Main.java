package dev.usadamasa.myapp;

import dev.usadamasa.mylib.exported.Greeting;
import dev.usadamasa.mylib.forcedexported.PrivateWidget;

public class Main {
    public static void main(String[] args) {
        String str = Greeting.hello("MYNAVI");
        System.out.println(str);

        new PrivateWidget().doSomething();
    }
}
