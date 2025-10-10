 // Sum of digits of a number
 class sum_of_digit {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;     
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
    
}
