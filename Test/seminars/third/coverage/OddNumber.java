package seminars.third.coverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberTest {

    private final OddNumber someService = new OddNumber();

    @Test
    void testEvenNumber() {
        assertTrue(someService.evenOddNumber(2));
        assertTrue(someService.evenOddNumber(100));
        assertTrue(someService.evenOddNumber(-4));
    }

    @Test
    void testOddNumber() {
        assertFalse(someService.evenOddNumber(3));
        assertFalse(someService.evenOddNumber(-11));
        assertFalse(someService.evenOddNumber(101));
    }

}
