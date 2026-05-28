// question  making a java class
// class Employee{
//     public int salary;
//     public String name;

//     public int getSalary(){
//         return salary;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setName(String newName){
//         name= newName;
//     }


//     public static void main(String []args){
//         Employee uday =new Employee();
//         uday.setName("uday");
//         uday.salary=10000;
//     System.out.println("Employee name is :" + uday.getName());
//     System.out.println("Employee salary is :" + uday.getSalary());
//     }
// }



// creating a class cellphone 
// class cellphone{
//     public String method1(){
//         return "ringing";
//     }
//     public String method2(){
//         return "vibrating";
//     }
//     public static void main(String []args){
//         cellphone sound=new cellphone();
//         System.out.println("method1 returns the :"+ sound.method1());
//         System.out.println("method2 returns the :" + sound.method2());
//     }
// }


// ye upar wala bhi thik tha but question requirement is different from this so 
// class cellphone {
//     public void ring(){
//         System.out.println("ringing.....");
//     }

//     public void vibrate(){
//         System.out.println("vibrating......");
//     }

//     public static void main(String []args){
//         cellphone asus =new cellphone();
//         asus.ring();
//         asus.vibrate();
//     }
// }

// import java.util.Scanner;

// class Square {
//     // Method jo float side accept karega
//     public float calculateArea(float s) {
//         return s * s;
//     }

//     public float calculatePerimeter(float s) {
//         return 4 * s;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Square mysquare = new Square();

//         System.out.print("Enter the side of the square (float): ");
//         float s = sc.nextFloat();

//         // Ab methods ko 's' pass kar rahe hain
//         System.out.println("Area: " + mysquare.calculateArea(s));
//         System.out.println("Perimeter: " + mysquare.calculatePerimeter(s));
        
//         sc.close();
//     }
// }



// class Animal{
//     String name;
//     int heaight;

//     public class Dog extends Animal{

//     }
//     public static void main (String []args){
//         System.out.println("hello uday!");
//     }
// }


//   class Animal{
//      abstract void makesound();

//      void sleep(){
//         System.out.println("this animal is sleeping..");
//     }
// }

// public class Dog extends Animal{
//     @Override
//      void makesound(){
//         System.out.println("woof..");
//     }
// }

//  class main {
//     public static void main(String []args){
//         Animal obj=new Dog();
//         obj.makesound();
//         obj.sleep();
//     }
// }



// anonymous class
// interface Greeting{
//     void Dog();
// }
// public class main {
//     public static void main (String[]args){
//         Greeting g= new Greeting{
//             @Override
//             public void Dog() {
//                 System.out.println("namaste kaise ho!");
//             }
//         }
//         g.Dog();
//     }
// }


class demo {
  String name ="uday";
  int age =21;
  void show (){
    System.out.println(name+ " " +age);
  }
}

class Test{
  public static void main (String args[]){
    demo r=new demo();
    r.show();
  }
}













