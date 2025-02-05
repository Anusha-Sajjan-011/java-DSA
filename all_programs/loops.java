// // public class loops {
// //     public static void main(String args[]){
// //         int counter = 0;
// //         while(counter < 100){
// //             System.out.println("Hello World!");
// //             counter++;
// //         }
// //         System.out.println("printed Hello World 100x");
        
// //     }
    
// // }


// // public class loops{
// //     public  static void main(String args[]){
// //         int counter = 1;
// //         while(counter <=  10){
// //             System.out.println(counter);
// //             counter++;
// //         }
// //         System.out.println("printed numbers from 1-10");
// //     }
// // }

// // public class loops{
// //     public  static void main(String args[]){
// //         int counter = 1;
// //         while(counter <=  100){
// //             System.out.print(counter + " ");
// //             counter++;
// //         }
// //         System.out.println();
// //     }
// // }


// // to print 1 - n numbers
// // import java.util.Scanner;

// // public class loops{
// //     public  static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         int range = sc.nextInt();
// //         int counter = 1;

// //         while(counter <= range){
// //             System.out.print(counter  + "  ");
// //             counter++;
// //         }
// //         System.out.println();

// //     }
// // }



// //sum of first n natural numbers

// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;

//         while(counter <= range){
//             System.out.print(counter  + "  ");
//             counter++;
//         }
//         System.out.println();
        
//     }
// }


// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i <= n){
//             sum += i;
//             i++;
//         }

//         System.out.println("Sum : " + sum);
        
//     }
// }


// for loop

// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         // int i = 1;
//         for(int i=1; i<=10; i++){
//             System.out.println("Hello World!");  
//         }         
//     }
// }


// print square pattern
// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         // // int i = 1;
//         //  for(int line=1; line<=4; line++){
//         //     System.out.println("****");

//         int line = 1;

//         while(line<=4){
//             System.out.println("****");
//             line++;
//         }       
//     }
// }


// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         // int n = 10899;

//         // while (n > 0){
//         //     int lastDigit = n % 10; // to get last number
//         //     System.out.print(lastDigit +" ");

//         //     n = n/10; // to shorten the number n = 10899/10 = 1089   n=1089/10=108
            

//         for( int n=10899; n>0; n/=10){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");
//         }
//     }
// }


// import java.util.Scanner;

// public class loops{
    // public  static void main(String args[]){

        // int n = 10899;
        // int rev = 0;

        // while(n > 0){
        //     lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n/10;
//         }
//     }
// }

// public class loops {
//     public static void main(String[] args) {
//         int rev = 0;

//         for (int n = 10899; n > 0; n /= 10) {
//             int lastDigit = n % 10;  // Extract the last digit
//             rev = (rev * 10) + lastDigit;  // Append it to the reversed number
//         }

//         System.out.println(rev);  // Print the reversed number
//     }
// }


// do while loop

// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         int counter= 1;
        
//         do{
//             System.out.println("hello world!");
//             counter++;
//         }while(counter <= 10);
//     }
// }

// break statement

// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.print("enetr your number :");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 break;
//             }
//             System.out.print(n);
//         }while(true);
//     }
// }


//continue statement
// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             if(i == 3){
//                 continue;
//             }
//             System.out.print(i);
//         }
//     }
// }    



// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.print("enetr your number : ");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 continue;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }


// prime or not

// import java.util.Scanner;

// public class loops{
//     public  static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n == 2){
//             System.out.println("n is prime");
//         }else{
//             boolean isPrime = true;
//             for(int i = 2; i<= Math.sqrt(n); i++){
//                 if(n % i == 0){
//                     isPrime = false;
//                 }
//             }
//             if(isPrime == true){
//                 System.out.println("n is prime");
//             }else{
//                 System.out.println("n is not prime");
//             }
//         }
//     }
// }


//fact of the number
// import java.util.Scanner;

// public class loops{

//     public  static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
       
//         int fact = 1;

//         int counter = 1;

//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();
        
//         while (counter <= n){
//             fact *= counter;
//             counter ++; 
            
//         }
//         System.out.println("Factorial of the number : " + fact);
       
//     }
// }




// import java.util.Scanner;

// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
       
//         int fact = 1;
        

//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
        
//         for (int counter = 1; counter <= n; counter++) {
//             fact *= counter;
//         }
        
//         System.out.println("Factorial of the number: " + fact);
//     }
// }



// table of the input number n

// import java.util.Scanner;

// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
    
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " * " + i + " = "  + n*i);
//         }
        
//     }
// }