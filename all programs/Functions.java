//find product of a and b

// public class functions {
//     public static int multiply(int a,int b){
//         int product = a * b;
//         return product;
//     }
//     public static void main(String args[]){
//         int a = 3;
//         int b = 5;
//         int product = multiply(a, b);
//         System.out.println("a*b = "+ product);
//         product = multiply(10,20);
//         System.out.println("a*b =" + product);
//     }
    
// }


// to find factorial of number,n

// public class functions {

//     public static int factorial(int n){
//         int f = 1;//initialize
//         for(int i = 1; i<= n; i++){
//             f = f*i;//f *= i
//         }
//         return f;//factorial n = n!
//     }
//     public static void main(String args[]){
//         System.out.println(factorial(4));
//         System.out.println(factorial(5));
//     }
    
// }
    


// Binomial coefficient nCr = n! / r! (n-r)!

// public class Functions {

//     public static int factorial(int n){
//         int f = 1;//initialize
//         for(int i = 1; i<= n; i++){
//             f = f*i;//f *= i
//         }
//         return f;//factorial n = n!
//     }

//     public static int bincoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int bincoeff = fact_n / (fact_r * fact_nmr);
//         return bincoeff;
//     }

//     public static void main(String args[]) {
//         System.out.println(bincoeff(5, 2));
//     }
    
// }



//print all prime numbers in range n
// public class Functions{
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i = 2; i<= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//         }

//         public static void primeIsRange(int n){
//             for(int i = 2; i <= n;i++){
//                 if(isPrime(i)){
//                     System.out.print(i + " ");
//                 }
//             }
//             System.out.println();
//         }

//         public static void main(String args[]){
//             primeIsRange(10);
//         }
// }


//average of three nnumbers
// public class Functions {
//     public static int average(int a, int b, int c){
//         int avg = (a+b+c)/ 3;
//         return avg;
//     }
//     public static void main(String[] args) {
//         int avg = average(1,2,3);
//         System.out.println(avg);
//     }
// }


// even or odd
// public class Functions {

//     public static int isEven(int a){
//         if(a % 2 == 0){
//             System.out.println(true);
//         }else{
//             System.out.println(false);
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         int a = isEven(5);
//         System.out.println(a);
//     }
// }



//palindrome
// public class Functions {
//     public static void main(String[] args) {
//         int number = 121; // Change this number to test different inputs
        
//         if (isPalindrome(number)) {
//             System.out.println(number + " is a palindrome.");
//         } else {
//             System.out.println(number + " is not a palindrome.");
//         }
//     }

//     // Function to check if a number is palindrome
//     public static boolean isPalindrome(int number) {
//         int originalNumber = number;
//         int reverse = 0;

//         // Reverse the number
//         while (number != 0) {
//             int digit = number % 10;
//             reverse = reverse * 10 + digit;
//             number /= 10;
//         }

//         // Check if originalNumber is equal to its reverse
//         return originalNumber == reverse;
//     }
// }




// public class Functions {
//     public static void main(String[] args) {
//         int number = 12345; // Change this number to test different inputs
//         int sum = computeDigitSum(number);
//         System.out.println("Sum of digits in " + number + " is: " + sum);
//     }

//     // Method to compute the sum of digits in an integer
//     public static int computeDigitSum(int number) {
//         int sum = 0;

//         // Loop until number becomes 0
//         while (number != 0) {
//             // Extract the last digit of the number
//             int digit = number % 10;
            
//             // Add the last digit to the sum
//             sum += digit;

//             // Remove the last digit from the number
//             number /= 10;
//         }

//         return sum;
//     }
// }


// public class Functions{
//     public static void  hollow_rectangle(int totRows,int totCols){
//         //outer layer
//         for(int i = 1; i<=totRows ; i++){
//             //inner laye
//             for(int j = 1; j<= totCols ; j++){
//                 //cell(i,j)
//                 if(i==1 || i == totRows || j == 1 || j == totCols){
//                     //boundary cells
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.err.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rectangle(4,5);
//     }
// }



// public class Functions{
//     public static void  half_triangle(int n){
//         for(int i = 1; i<=n ; i++){
//             for(int j = 1; j<= n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<=i ; j++){
//                 System.out.print("*");
//             }

//             System.out.println();

//         }
//     }
//     public static void main(String[] args) {
//         half_triangle(4);
//     }
// }


public class Functions{
    public static void Inverted_half_pyramid_with_no(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_half_pyramid_with_no(5);
    }
}