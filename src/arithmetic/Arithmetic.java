/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * author Gagandeep kaur
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        ArithmeticOperation operation = getArithmeticOperation();
        double result = r.calculate(m,n);
        System.out.println("result :" +result); 
    
    }
    
     private static ArithmeticOperation getArithmeticOperation() {
        System.out.println("Enter arithmetic operation to Perform:");
        System.out.println("Options: PLUS, MINUS, TIMES, DIVIDE");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        return ArithmeticOperation.valueOf(input);
    }
}

