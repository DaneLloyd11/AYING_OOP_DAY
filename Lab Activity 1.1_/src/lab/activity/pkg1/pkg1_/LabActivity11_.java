
package lab.activity.pkg1.pkg1_;

import java.util.Scanner;

public class LabActivity11_ {
    
    static Scanner InputString = new Scanner(System.in);
    static Scanner InputInteger = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter Your Full name: ");
        String name = InputString.nextLine();
        System.out.print("Enter Your age: ");
        int age = InputInteger.nextInt();
        System.out.print("Enter Your Gender: ");
        String gender = InputString.nextLine();
        System.out.print("Enter Your Full Address: ");
        String address = InputString.nextLine();
        System.out.print("Enter Your Civil Status: ");
        String status = InputString.nextLine();
        System.out.print("Enter The Number of Your Brother/Sister: ");
        int siblings = InputInteger.nextInt();
        
        InputString.nextLine();
        
        System.out.println("Full name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address " + address);
        System.out.println("Civil Status" + status);
        System.out.println("# of brothers/sister: " + siblings);
        
        
    }
    
}
