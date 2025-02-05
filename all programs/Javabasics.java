// public class Javabasics{
//     public static void main(String args[]){
//         System.out.print("Hello world!");
//     }
// }

// public class Javabasics{
//     public static void main(String args[]){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// public class Javabasics{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         int sum = a+b;
//         System.out.println(sum);
//         }
// }

//sum of a  and b

// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println(sum);
//        }
// }

// product of a & b

// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int product = a*b;
//        System.out.println(product);
//        }
// }

//area of a circle

// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        float rad = sc.nextFloat();
//        float area = 3.14f * rad * rad;
//        System.out.println(area);
//        }
// }

// practice questions on variables and data types
// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int avg = (a+b+c)/3;
//        System.out.println("average is : " + avg);
//        }
// }

// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = a;
//        int area = a * b;
//        System.out.println("Area of square is : " + area);
//        }
// }

//or 

// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int side = sc.nextInt();
//        int area = side * side;
//        System.out.println("Area of square is : " + area);
//        }
// }

// 3rd question

// import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        float pencil = sc.nextFloat();
//        float pen = sc.nextFloat();
//        float eraser = sc.nextFloat();
//        float total = pencil + pen + eraser;
//        System.out.println("Total cost is : " + total);

//        // Add on with 18% gst tax
//        float newTotal = total + (0.18f * total);
//        System.out.print("Bill with 18% tax : " + newTotal);
//        }
// }

import java.util.Scanner;

public class Javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sc.close();
    }
}



