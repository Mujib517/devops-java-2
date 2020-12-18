package com.aws.api.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {
    @Test
    public void addShouldAddTwoNumbers() {
        Math m = new Math();
        int res = m.add(10, 20);

        assertEquals(30,res);
    }
}
