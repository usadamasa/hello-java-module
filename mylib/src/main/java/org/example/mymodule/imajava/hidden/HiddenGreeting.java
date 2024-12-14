package org.example.mymodule.imajava.hidden;

import org.usadamasa.auto.AutoModuleLib;

public class HiddenGreeting {
    public String hello(String name) {
        String s = new AutoModuleLib().autoModuleHello(name);
        return "(Hidden) -> " + s;
    }
}