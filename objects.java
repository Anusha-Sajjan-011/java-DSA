// public class objects{
//     public static void main(String args[]){
//         int x = 2; int y = 5;
//         int exp1 = (x * y / x); //5
//         int exp2 = (x * (y / x));//4  5/2 = 2.5 = 2 * 2=4
//         System.out.print(exp1 + " ,");
//          System.out.print(" " + exp2);
//     }
// }

// public class objects{
//     public static void main(String args[]){
//        int x, y, z;
//        x = y = z= 2;
//        x += y;//4
//        y -= z;//0
//        z /= (x + y);// z/(x+y) = 2/4 = 0.5 its in float but converts into int here thats why op is 0
//          System.out.print(x + " " + y + " " + z);
//     }
// }

// public class objects{
//     public static void main(String args[]){
//        int x=9, y=12;
//        int a=2, b=4, c=6;
//        int exp = 4/3 * (x+34) + 9 * (a + b * c) + (3 + y * (2 + a))/ (a + b*y); // 278
//        System.out.println(exp);
//     }
// }

// public class objects{
//     public static void main(String args[]){
//           int x = 10, y = 5;
//           int exp1 = (y * (x / y + x / y));//20
//           int exp2 = (y * x / y + y * x / y);//20
//           System.out.println(exp1);
//           System.out.println(exp2);
//     }
// }

// public class objects{
//     public static void main(String args[]){
//           int x = 200, y = 50, z = 120;
//           if( x > y && y > z)
//           System.out.println("Hello");  //false- not printed
//           if( z > y && z < x)
//           {
//              System.out.println("Java");  // true - Java
//           }
//           if( (y+200) < x && (y+150) < z) // 250 < 200 && 200 < 100  - false - not printed
//           {
//             System.out.println("Hello Java");
//           }
//     }
// }