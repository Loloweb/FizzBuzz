public class FizzBuzz {
    // first try handling this using my knowledge
    // a regular person probably can't read this
    public String convert(int number) {
        StringBuilder res = new StringBuilder();
        if (number%3==0 || String.valueOf(number).contains("3")) res.append("fizz");
        if (number%5==0 || String.valueOf(number).contains("5")) res.append("buzz");
        if (number%3!=0 && number%5!=0) return String.valueOf(number);
        return res.toString();
    }

    public void hundredCount() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }
}
