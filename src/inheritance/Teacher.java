
package inheritance;

import java.util.Scanner;


public class Teacher extends Person {
    //Scanner input = new Scanner(System.in);
    
    String qualifications;
    
    
     void displayInfo2(){
         displayInfo1();
         //System.out.println("Qualifications : " +qualifications);
        
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Quali: ");
         qualifications = input.nextLine();
          System.out.println("\n");
         
     }
    
}
