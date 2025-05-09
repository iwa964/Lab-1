/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            i = fizzBuzzer(i);
        }
    }

    public static int fizzBuzzer(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy5 && divisibleBy3) {
            System.out.println("Fizz Buzz");
        }
        else if (divisibleBy5) {
            System.out.println("Buzz");
        }
        else if (divisibleBy3) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(i);
        }
        i += 1;
        return i;
    }
}

