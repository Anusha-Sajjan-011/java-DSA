// // // public class OOPS {
// // //     public static void main(String args[]){
// // //         Student s1 = new Student();
// // //         s1.name = "anusha";
// // //         s1.roll = 234;
// // //         s1.password = "abcd";
// // //         s1.marks[0] = 100;
// // //         s1.marks[1] = 99;
// // //         s1.marks[2] = 98;

// // //         Student s2 = new Student(s1);
// // //         s2.password = "xyz";

// // //         for(int i=0; i<3; i++){
// // //             System.out.println(s2.marks[i]);
// // //         }
// // //     }
// // // }

// // // class Student{
// // //     String name;
// // //     int roll;
// // //     String password;
// // //     int marks[];

// // //     //copy Constructor
// // //     // Shallow copy contstructor
// // //     // Student(Student s1){
// // //         // marks = new int[3];
// // //         // this.name = s1.name;
// // //         // this.roll = s1.roll;
// // //     //     this.marks = s1.marks;//reference copy--
// // //     // }

// // //     // deep copy constructor
// // //     Student(Student s1){
// // //         marks = new int[3];
// // //         this.name = s1.name;
// // //         this.roll = s1.roll;
// // //         for(int i=0; i<marks.length; i++){
// // //             this.marks[i] = s1.marks[i];
// // //         }

// // //     }

// // //     Student() {
// // //         marks = new int[3];
// // //         System.out.println("construcor ia called");
// // //     }
// // //     Student(String name) {
// // //         marks = new int[3];
// // //         this.name = name;
// // //     }
// // //     Student(int roll) {
// // //         marks = new int[3];
// // //         this.roll = roll;
// // //     }
// // // }



// // //inheritance
// // public class OOPS {
// //     public static void main(String[] args) {  
// //         // fish shark = new fish();
// //         // shark.eat();
// //         Dog dobby= new Dog();
// //         dobby.eat();
// //         // dobby.legs = 4;
// //         // System.out.println(dobby.legs);

// //     }
// // }

// // class Animal{
// //     String color;

// //     void eat() {
// //         System.out.println("eats");
// //     }

// //     void breath() {
// //         System.out.println("breath");
// //     }  
// // }

// // class Mammals extends Animal{
// //     void walk(){
// //         System.out.println("walks");
// //     }
// // }

// // class Fish extends Animal{
// //     void swim(){
// //         System.out.println("swim");
// //     }
// // }

// // class Bird extends Animal{
// //     void flly(){
// //         System.out.println("walks");
// //     }
// // }

// // class Dog extends Mammals {
// //     String breed;
// // }
// // // derived class/ sub cls
// // // class  fish extends Animal {
// // //     int fins;

// // //     void swims() {
// // //         System.out.println("swims in water");
// // //     }
// // // }    




// // abstraction
// // public class OOPS {
// //     public static void main(String[] args) {
// //         // Animal- horse - mustang class
// //         Mustang myHorse = new Mustang();

// //         // Horse h = new Horse();
// //         // h.eat();
// //         // h.walk();

// //         // Chicken c = new Chicken();
// //         // c.eat();
// //         // c.walk();
// //         // System.out.println(h.color);

// //         //Animal a = new Animal();//cannot instantiate the type Animal in Java(16777373)
    
// //     }
// // }

// // abstract class Animal {//So Animal Just give idea in the form walk function is exists in every animal
// //     String color;
    
// //     Animal() {//constructor
// //         //color ="brown";//parent class call first
// //         System.out.println("animal constructor called"); 

// //     }
// //     void eat(){
// //         System.out.println("animals eat");// there is a implimentation inside the curly braces
// //     }

// //     abstract void walk();// no implimentation -> walk process is depends on Horse and Chicken not depend on Animal.. So Animal Just give idea 
// // }

// // class Horse extends Animal{
// //     Horse(){
// //         System.out.println("Horse constructor is called");
// //     }
// //     void changeColor() {
// //         color = "dark brown";
// //     }
// //     void walk(){
// //         System.out.println("walks on 4 legs");
// //     }
// // }

// // class Mustang extends Horse {
// //     Mustang() {
// //         System.out.println("Mustang constrctor called");
// //     }
// // }


// // class Chicken extends Animal{
// //     void changeColor() {
// //         color = "Yellow";
// //     }
// //     void walk(){
// //         System.out.println("walks on 2 legs");
// //     }
// // }


// //interface

// public class OOPS {
//     public static void main(String[] args) {
//         Bear b = new Bear();
//         b.eats();
       
//     }   
// }

// // interface ChessPlayer {//blue print
// //     void moves();//abstract and public by default
// // }

// // class Queen implements ChessPlayer{
// //     public void moves() {
// //         System.out.println("up, down, left, right, diagonal(in 4 dir)");
// //     }
// // }

// // class Rook implements ChessPlayer{
// //     public void moves() {
// //         System.out.println("up, down, left, right");
// //     }
// // }

// // class King implements ChessPlayer{
// //     public void moves() {
//         // System.out.println("up, down, left, right, diagonal(by 1 step)");
// //     }
// // }

// interface Herbivore {
//     void eats();
// }

// interface Carnivore {
//     void eats();

// }
// class Bear implements Herbivore, Carnivore{
//     public void eats() {
//         System.out.println("eats both grass and meat");
//     }

// }