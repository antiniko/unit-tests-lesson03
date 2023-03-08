package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class IntervalTest {

    private final Interval interval = new Interval();

    @Test
    void testNumberInRange() {
        assertTrue(interval.numberInInterval(30));
        assertTrue(interval.numberInInterval(50));
        assertTrue(interval.numberInInterval(99));
    }

    @Test
    void testNumberOutOfRange() {
        assertFalse(interval.numberInInterval(10));
        assertFalse(interval.numberInInterval(25));
        assertFalse(interval.numberInInterval(100));
        assertFalse(interval.numberInInterval(200));
    }
}