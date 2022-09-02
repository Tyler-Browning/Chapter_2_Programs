
/**
 * Tyler Browning
 * 9/1/2022
 * Random Phone Number
 * This Program will generate a random phone number for the user
 */

import java.util.Random;

public class phoneNumber
{
    public static void main(String[] args)
    {
        Random ranNum = new Random();
        
        int one;
        int two;
        int three;
        int twoLine;
        int threeLine;
        
        one = ranNum.nextInt(8);
        two = ranNum.nextInt(8);
        three = ranNum.nextInt(8);
        twoLine = ranNum.nextInt(642)+100;
        threeLine = ranNum.nextInt(9000)+1000;
        
        int num;
        num = (int)(ranNum.nextDouble()*10000);
        System.out.println("The Random Number is " + num);
        
        
        System.out.println("Your Random Phone Number is " + one + two + three + "-" + twoLine + "-" + threeLine);
        
    }
}
