public class Recursive_power {
    public static int power(int base, int exp) {
        if (exp == 0) // base case
            return 1;
        else
            return base * power(base, exp - 1); 
    }

    public static void main(String[] args) {
        int base = 2; // You can change this value to test with different bases
        int exp = 3;  // You can change this value to test with different exponents
        int result = power(base, exp);
        System.out.println(base + " raised to the power of " + exp + " is: " + result);
    }

    
}
