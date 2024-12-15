package org.usadamasa.autoapp;

import org.usadamasa.mylib.exported.Greeting;
import org.usadamasa.split.WidgetOne;
import org.usadamasa.split.WidgetTwo;

public class Main {
    public static void main(String[] args) {
        System.out.println(callSplitPackage("World"));
        System.out.println("Hello, World!");
    }

    public static String callMyLib(String name) {
        Greeting greeting = new Greeting();
        return greeting.hello(name);
    }

    public static String callSplitPackage(String name) {
        WidgetOne widgetOne = new WidgetOne();
        WidgetTwo widgetTwo = new WidgetTwo();
        return widgetOne.widgetOneHello(name) + " " + widgetTwo.widgetTwoHello(name);
    }
}
