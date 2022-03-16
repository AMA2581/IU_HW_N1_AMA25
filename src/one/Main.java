
// Amir Mahdi Abravesh
// Q1

package one;

import java.util.Scanner;

public class Main{

    private static int adding(int first, int second) {
        first = first + second;
        return first;
    }
    
    private static int x3(){
        Scanner userInput = new Scanner(System.in);
        int a;

        System.out.print("Zaribe (x3) ra vared konid: ");
        a = userInput.nextInt();

        return a;
    }

    private static int x2(){
        Scanner userInput = new Scanner(System.in);
        int b;

        System.out.print("Zaribe (x2) ra vared konid: ");
        b = userInput.nextInt();

        return b;        
    }

    private static int x(){
        Scanner userInput = new Scanner(System.in);
        int c;

        System.out.print("Zaribe (x) ra vared konid: ");
        c = userInput.nextInt();

        return c;        
    }

    private static int d(){
        Scanner userInput = new Scanner(System.in);
        int d;

        System.out.print("(d) ra vared konid: ");
        d = userInput.nextInt();

        return d;        
    }

    public static void main(String[] args){

        // THESE ARRAYS HAVE 4 SPACES
        int [] e1 = new int[4];
        int [] e2 = new int[4];
        
        // FIRST EQUATION
        e1[0] = x3();
        e1[1] = x2();
        e1[2] = x();
        e1[3] = d();

        // SECOND EQUATION
        e2[0] = x3();
        e2[1] = x2();
        e2[2] = x();
        e2[3] = d();

        // ADDING THE ARRAYS AND SAVING IT IN e1[]
        for (int i = 0; i != 3; i++){
        e1[i] = adding(e1[i], e2[i]);
        }

        System.out.print("\n javabe shoma: \n");

        if (e1[0] != 0){
            System.out.print(e1[0]);
            System.out.print("x3");
        }

        System.out.print(" ");

        if (e1[1] != 0){

            if(e1[1] >= 0){
                System.out.print("+");
            }

            System.out.print(e1[1]);
            System.out.print("x2"); 
        }

        System.out.print(" ");

        if (e1[2] != 0){

            if(e1[2] >= 0){
                System.out.print("+");
            }

            System.out.print(e1[2]);
            System.out.print("x"); 
        }

        System.out.print(" ");

        if (e1[3] != 0){

            if(e1[3] >= 0){
                System.out.print("+");
            }

            System.out.print(e1[3]);
        }
    }
}