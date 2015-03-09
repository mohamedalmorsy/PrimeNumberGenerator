package virgil;

public class Stress {
    public static void main(String[] args) {
        String function = args[0];

        if (function.equalsIgnoreCase("sieve")) {
            int N           = Integer.parseInt(args[1]);
            int primeCount  = new Sieve().calculatePrimeCount(N);

            System.out.println("The number of primes <= " + N + " is " + primeCount);
        }
    }
}