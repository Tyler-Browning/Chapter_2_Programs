    
/**
 * Tyler Browning
 * 8/31/22
 * Coins Program
 * This program will print the value of a certain amount of coins in a jar
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class coins
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       int quar;
       int dime;
       int nick;
       int penn;
       double totq;
       double totd;
       double totn;
       double totp;
       double total;
       
       System.out.println("How many quarters do you have?");
       quar = scan.nextInt();
       totq = quar*0.25;
       
       System.out.println("How many dimes do you have?");
       dime = scan.nextInt();
       totd = dime*0.10;
       
       System.out.println("How many nickles do you have?");
       nick = scan.nextInt();
       totn = nick*0.05;
       
       System.out.println("How many pennies do you have?");
       penn = scan.nextInt();
       totp = penn*0.01;
       
       
       total = totp + totn + totd + totq;
       
       NumberFormat money = NumberFormat.getCurrencyInstance();
       System.out.println("Total amount of money in your coin jar: " + money.format(total));
       
   }
}
