import java.io.*;
import java.util.*;
public class arthematicoperations{
    public static void main(String[] args){
      
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();

        System.out.println("Choose operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multipication");
        System.out.println("4.Divison");

        
        System.out.print("give your chosen number:");
        int c = input.nextInt();
        switch (c) {

        

        case 1:
            System.out.println("Addition" +" " + (a + b));
            break;
        case 2:
            System.out.println("Subtraction"+" " + (a - b));
            break;

        case 3:
            System.out.println("Multpilcation"+" " + (a * b));
            break;
        case 4:
            if (b != 0){
                System.out.println("Divison"+" " + (a / b));
            }
            else{
               System.out.println("Divison is not vaild");

            }

            break;

        }
    
        input.close();
    }

}