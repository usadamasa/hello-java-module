package org.usadamasa.mylib.mylib;

import org.junit.jupiter.api.Test;
import org.usadamasa.mylib.exported.Greeting;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    public void testHello() {
        assertEquals("(Exports Module)", Greeting.hello("Alice"));
    }
}
