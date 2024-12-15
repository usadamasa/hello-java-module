package dev.usadamasa.mylib.exported;


import dev.usadamasa.acllib.CallSplitPackage;
import dev.usadamasa.mylib.hidden.HiddenGreeting;

public class Greeting {
    public static String hello(String name) {
        String s = new HiddenGreeting().hello(name);
        return "(Exports Module) -> " + s;
    }

    public static String callChild(String name) {
        return CallSplitPackage.callSplitPackage(name);
    }
}
