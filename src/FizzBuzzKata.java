public class FizzBuzzKata {
    // second try through applying coding dojo's teachings
    // simple to read, easy to understand
    public String convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }

        if (number % 3 == 0) {
            return "fizz";
        }

        if (number % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(number);
    }

    public void hundredCount() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }
}
