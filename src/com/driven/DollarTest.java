package com.driven;
/** Getting to green:
 * Fake it - return a constant and gradually replace with variables
 * use obvious implementation - type the most obvious implementation
 * Triangulation - only generalise code when we have 2 examples or more. when the second example require a more general solution, we then generalise.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void times() {
        Money five = new Money(5, "USD");

        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
        assertEquals(Money.dollar(10),five.times(2));

    }

    void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

    }
}