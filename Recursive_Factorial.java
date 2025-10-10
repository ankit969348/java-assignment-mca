 // Recursive: factorial

 class Recursive_Factorial {
  public static int factorial(int n) {
 if (n == 0) // base case
 return 1;
 else
 return n * factorial(n - 1); 
 }
 public static void main(String[] args) {
 System.out.println("Factorial of 4 = " + factorial(4));
 }
}
