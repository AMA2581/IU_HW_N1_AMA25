
// Amir Mahdi Abravesh
// Q2

package two;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Triangle Triangle = new Triangle();
         
        int userInput;
        System.out.print("Please enter a positive integer: ");
        Scanner Input = new Scanner(System.in);
        userInput = Input.nextInt();
        
        if (userInput > 0){
        
            System.out.println("A: ");
            Triangle.aTri(userInput);

            System.out.println("\nB: ");
            Triangle.bTri(userInput);

            System.out.println("\nC: ");
            Triangle.cTri(userInput);

            System.out.println("\nD: ");
            Triangle.dTri(userInput);

            System.out.println("\nE: ");
            Triangle.eTri(userInput);

            System.out.println("\nF: ");
            Triangle.fTri(userInput);
        }

        else{
            System.out.println("Invalid!!!");
        }
    }
}
