package org.example.mymodule.imajava.mylib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    public void testHello() {
        assertEquals("(Exports Module)", Greeting.hello("Alice"));
    }
}
