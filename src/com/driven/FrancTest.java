package com.driven;
/** Getting to green:
 * Fake it - return a constant and gradually replace with variables
 * use obvious implementation - type the most obvious implementation
 * Triangulation - only generalise code when we have 2 examples or more. when the second example require a more general solution, we then generalise.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrancTest {
    @Test
    void times() {
        Franc five = new Franc(5);

        assertEquals(new Franc(10),five.times(2));
        assertEquals(new Franc(15),five.times(3));
        assertEquals(new Franc(10),five.times(2));
    }

    @Test
    void testEquals() {
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}