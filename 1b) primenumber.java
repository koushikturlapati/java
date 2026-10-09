import java.io.*;
import java.util.*;
public class primenumber {
    public static void main(String[] args){
        System.out.println("enter a message:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isprime = true;
        
        
        if(num <= 1) {
            isprime = false;
        }

        else{
            for (int i = 2; i < num; i++){
                if (num % i == 0) {
                    isprime = false;
                break;

            }
        }
    }
    if(isprime) {
        System.out.println(num +"is a prime number");
    }
    else{
        System.out.println(num +" " + " is not a prime number");
    }
    input.close();
    }
}
