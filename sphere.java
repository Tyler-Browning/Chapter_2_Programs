
/**
 * Tyler Browning
 * 8/31/22
 * Sphere Program
 * This program will read the radius of a sphere and prints its volume and SA
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class sphere
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        double rad;
        double vol;
        double sa;
        DecimalFormat fmt = new DecimalFormat ("0.0000");
        
        
        System.out.println("What is the raduis of your sphere?");
        rad = scan.nextDouble();
        
        
        vol = (4.0/3.0)*Math.PI*(Math.pow(rad, 3));
        sa = 4*Math.PI*Math.pow(rad, 2);
        
        
        System.out.println("Volume of you sphere: " + fmt.format(vol));
        System.out.println("Surface Area of you sphere: " + fmt.format(sa));
    }
}
