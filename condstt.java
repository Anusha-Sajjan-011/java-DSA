// import java.util.*;

// public class condstt{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number >= 0){
//             System.out.println("Number is Positive");
//         } else{
//             System.out.println("Number is negetive");
//         }
        
//     }
// }



// import java.util.*;

// public class condstt{
//     public static void main(String args[]){
//         double temp = 103.0;
//         if(temp >= 100){
//             System.out.println("I have fever");
//         } else{
//             System.out.println("I don't have fever");
//         }      
//     }
// }

        

// import java.util.*;
// public class condstt{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the week number between (1-7) : ");
//         int week = sc.nextInt();

//         switch (week) {
//             case 1:System.out.println("Sunday");
//                    break;
//             case 2:System.out.println("Monday");
//                     break;
//             case 3:System.out.println("Tuesday");
//                     break; 
//             case 4:System.out.println("Wednesday");
//                     break; 
//             case 5:System.out.println("Thursday");
//                     break;
//             case 6:System.out.println("Fridayy");
//                     break;
//             case 7:System.out.println("satday");
//                     break;              
        
//             default:System.out.println("The week doesn't exist");
//                    break;
//         }

//     }
// }


// public class condstt{
//     public static void main(String args[]) {
//     int a=63,b=36;
//     String y = (a > b)? "a" : "b";
//     System.out.println(y);
//   }
// }

// public class condstt{
//     public static void main(String args[]) {
//     int a=63,b=36;
//     String value = ( a < b) ? "true" : "false";
//     System.out.println(value);
//   }
// }

//leap year

// import java.util.Scanner;

// public class condstt{
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
    
//     System.out.println("enter the year : ");
//     int year = sc.nextInt();

//     if(year % 4 == 0){
//         System.out.println("leap year");
//     }else if(year % 100 != 0 && year % 400 == 0){
//         System.out.println("leap year");
//     }else{
//         System.out.println("not a leap year");
//     }

//   }
// }

// or

// import java.util.Scanner;

// public class condstt {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the year: ");
//         int year = sc.nextInt();

//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     System.out.println("Leap year");
//                 } else {
//                     System.out.println("Not a leap year");
//                 }
//             } else {
//                 System.out.println("Leap year");
//             }
//         } else {
//             System.out.println("Not a leap year");
//         }
    
//     }
// }
