package three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Diamond diamond = new Diamond();

        int userInput;
        System.out.print("Please enter a positive integer: ");
        Scanner Input = new Scanner(System.in);
        userInput = Input.nextInt();

        if (userInput > 0){

            System.out.println("Diamond: ");
            diamond.diamond(userInput);
        }

        else{
            System.out.println("Invalid!!!");
        }
    }
}
