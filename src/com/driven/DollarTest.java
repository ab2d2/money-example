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
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);

        assertEquals(10,product.amount);
        product = five.times(3);
        assertEquals(15,product.amount);
    }

    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

    }
}