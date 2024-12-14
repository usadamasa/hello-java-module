package org.example.mymodule.imajava.mylib;

import org.example.mymodule.imajava.hidden.HiddenGreeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    public void testHello() {
        assertEquals("(Exports Module)", Greeting.hello("Alice"));
    }

    @Test
    public void testSample() {
        var greeting = new HiddenGreeting();
        greeting.sample();
    }
}
