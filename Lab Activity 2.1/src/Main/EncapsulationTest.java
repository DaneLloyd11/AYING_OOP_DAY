
package Main;

import Encapsulation.Encapsulation;
import java.util.Scanner;

public class EncapsulationTest {
    static Scanner InputString = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Encapsulation a1 = new Encapsulation();
        
        System.out.print("Enter test case number: ");
        int testCase = scanner.nextInt();
        scanner.nextLine();
        
        switch(testCase)
        {
            case 1 -> 
            { 
                a1 = new Encapsulation("Dane Lloyd", "Aying", 17);
                System.out.println("Test Case 1: Student under 18");
                System.out.println(a1.toString());
            }
            case 2 ->
            {
                a1 = new Encapsulation("Dane Lloyd", "Aying", 17);
                System.out.println("Test Case 2: Increase age of student");
                a1.increamentage();
                System.out.println(a1.toString());
            }
            case 3 ->
            {
                a1 = new Encapsulation("Dane Lloyd", "Aying", 19);
                System.out.println("Test Case 3: Test Case 3: Student over 18");
                System.out.println(a1.toString());
            }
        }
    }
    
}
