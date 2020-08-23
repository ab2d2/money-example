package com.driven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void times() {
        Dollar five = new Dollar(5);

        five.times(2);

        assertEquals(10,five.amount);

    }
}