

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result = 0;
        System.out.println("Please enter the temperature(e.g., 10.0 C or 20.0 F)");


        double Temperature = in.nextDouble();
        String Unit=in.next();
        if(Unit.contains("c")||Unit.contains("C")) {
            result=Temperature * 9 /5 + 32;

            System.out.println("The converted temperature is "+result+" F");
        }
        if(Unit.contains("F")||Unit.contains("f")) {
            result=(Temperature - 32) * 5 / 9;

            System.out.println("The converted temperature is "+result+" C");
        }
        else{
            System.out.println("You have entered the wrong format");
        }


        in.close();
    }
}