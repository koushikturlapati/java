import java.util.*;
class SumOfNNumbers{
    public static void main(String[] args){
        System.out.print("enter the number for arithematic progression:");
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int i = 1, sum = 0;
        if (n >= 1){
        do {
            sum += i ;
            i++; 
        } while (i <= n);
        System.out.print("sum of n numbers:"+ sum);
        }   
        input.close();

    }
}