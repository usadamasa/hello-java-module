package org.example.myapp.main;

import org.usadamasa.mylib.exported.Greeting;

public class Main {
    public static void main(String[] args) {
        String str = Greeting.hello("MYNAVI");
        System.out.println(str);
    }
}
