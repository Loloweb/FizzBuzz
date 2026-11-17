import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzztest {

    // both of these work, one is more simple than the other
    //private final FizzBuzz fizzbuzz = new FizzBuzz();
    private final FizzBuzzKata fizzbuzz = new FizzBuzzKata();

    @Test
    void no_fizz_buzz() {
        assertEquals("1", fizzbuzz.convert(1));
        assertEquals("2", fizzbuzz.convert(2));
        assertEquals("4", fizzbuzz.convert(4));
    }

    @Test
    void yes_fizz() {
        assertEquals("fizz", fizzbuzz.convert(3));
        assertEquals("fizz", fizzbuzz.convert(6));
    }

    @Test
    void yes_buzz() {
        assertEquals("buzz", fizzbuzz.convert(5));
        assertEquals("buzz", fizzbuzz.convert(10));
    }

    @Test
    void yes_fizzbuzz() {
        assertEquals("fizzbuzz", fizzbuzz.convert(15));
        assertEquals("fizzbuzz", fizzbuzz.convert(30));
    }
}
