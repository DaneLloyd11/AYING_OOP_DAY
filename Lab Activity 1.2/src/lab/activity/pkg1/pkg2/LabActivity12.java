
package lab.activity.pkg1.pkg2;

import java.util.Scanner;

public class LabActivity12 {

    static Scanner Data = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter Your Message: ");
        String txt = Data.nextLine();
        int detect = 0;
        
        if (txt.length() >= 2 && Character.isUpperCase(txt.charAt(0)) && Character.isUpperCase(txt.charAt(1))) {
            detect = 1;
        } 
        
        
        if(detect == 1)
        {
            System.out.print("JeJe");
        }
        else
        {
            System.out.print("uWu");
        }
    }
}
