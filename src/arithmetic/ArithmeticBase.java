/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 public double x,y; 
 public enum OPERATION {ADD, MULTIPLY,SUBTRACT,DIVIDE}
 private OPERATION op = OPERATION.ADD;

 public ArithmeticBase()
   {this.op = OPERATION.ADD;}

 public void setOperation (int input){         
        if (input == 0){this.op = OPERATION.ADD;}
        else if (input == 1){this.op = OPERATION.SUBTRACT;}
        else if (input == 2){this.op = OPERATION.MULTIPLY;}
        else if (input == 3){this.op = OPERATION.DIVIDE;}
        else {System.out.println("You did not input a number between 0-3!");}}
 
  public double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: 0 ADD,1 SUBTRACT,2 MULTIPLY,3 DIVIDE ");
        
        int input = sc.nextInt();
        
        this.setOperation(input);
        
        if (this.op == OPERATION.ADD){return (x+y);}
        else if (this.op == OPERATION.SUBTRACT){return (x-y);}
        else if (this.op == OPERATION.MULTIPLY){return (x*y);}
        else {return x/y;}
}
        
        
        
    
   
}
