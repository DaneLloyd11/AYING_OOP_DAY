/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.activity.pkg2.pkg3;

import java.util.Stack;

/**
 *
 * @author Rachel
 */
public class TextEditor {
    
   private String text;
   protected Stack<String> history;

    public TextEditor(String text) {
        this.text = text;
        this.history = new Stack<>();
    }

    public void setText(String text) {
        this.text = text;
        history.clear();
    }

    public String getText() {
        return text;
    }

   public void append(String newText)
   {
       text += newText;
       history.push(text);
   }
    
    public void delete(int n)
    {
        if(n <= text.length())
        {
            text = text.substring(0, text.length() - n);
            history.push(text);
        }
    }
}
