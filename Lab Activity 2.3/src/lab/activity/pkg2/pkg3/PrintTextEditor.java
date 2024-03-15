/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.activity.pkg2.pkg3;

/**
 *
 * @author Rachel
 */
public class PrintTextEditor extends TextEditor {
    
    public PrintTextEditor(String text)
    {
       super(text);
    }
    
    public void print()
    {
       System.out.println(getText());
    }
    
}
