/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplecalculator;


public class Calculator {
    
    private double firstOperand;
    private double secondOperand;
    private char operator;

    public Calculator() {
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public double calculateResult()
    {
        double result = 0.0;
        switch(operator)
        {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if(secondOperand != 0)
                {
                result = firstOperand / secondOperand;
                }
                else
                {
                  throw new IllegalArgumentException("Error! Second Operand Cannot Be Zero.");
                }
                break;    
        }
        return result;
    }
    
}
