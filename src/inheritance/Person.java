
package inheritance;

import java.util.Scanner;


public class Person {
    String name;
    int age, phone;
    
    void displayInfo1(){
      //  System.out.println("Name: " +name);
        //System.out.println("Age: " +age);
        //System.out.println("phone: " +phone);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        phone = sc.nextInt();
    }
}
