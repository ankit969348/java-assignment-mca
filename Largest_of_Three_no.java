 // Largest of three numbers

public class Largest_of_Three_no {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15; // You can change these values to test with different numbers
        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest of the three numbers is: " + largest);
    }
}
