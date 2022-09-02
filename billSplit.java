
/**
 * Tyler Browning and Nick Patel
 * 8/30/2022
 * Bill Split Program
 * This program will help friends at a reastraunt split the bill
 */

import java.util.Scanner;

public class billSplit
{
    public static void main(String[] args)
    {
        int num;
        double bill;
        double tip;
        double total;
        double perPerson;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many people are there to serve?");
        num = scan.nextInt();
        
        System.out.println("How much was the bill?");
        bill = scan.nextDouble();
        
        tip = (bill * .20);
        total = (bill + tip);
        perPerson = (total/num);
        
        System.out.println("Bill: " + bill + "\nTip: " + tip);
        System.out.println("Each person should pay " + perPerson);
    
    }
}
