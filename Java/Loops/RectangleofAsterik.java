package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class RectangleofAsterik {
    public static void main(String args[]) 
    {
       Scanner myObj = new Scanner(System.in);
        int value = myObj.nextInt();
        int value2 = myObj.nextInt();
        for(int i=1;i<=value;i++){
           for(int j=1;j<=value2;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}
