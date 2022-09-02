
/**
 * Tyler Browning
 * 9/2/2022
 * Name Formatting Program
 * Have user enter in name and format the name
 */

import java.util.Scanner;

public class nameFormat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String name = new String();
        
        System.out.println("Enter in your full name:");
        
        name = scan.nextLine();
        System.out.println(name.indexOf(" "));
    }
}
