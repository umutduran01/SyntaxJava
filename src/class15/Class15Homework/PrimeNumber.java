package class15.Class15Homework;

public class PrimeNumber {

    String isPrime(int num) {

        boolean prime = true;

        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            return num + " is a prime number.";
        } else {
            return num + " is not a prime number.";
        }
    }


    public static void main(String[] args) {

        //Write a method to return whether given number is prime or not?

        PrimeNumber number = new PrimeNumber();
        System.out.println(number.isPrime(5));
    }
}
