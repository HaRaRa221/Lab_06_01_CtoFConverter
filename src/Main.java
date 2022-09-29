import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        double tempCelcius =0;
        double tempFahren = 0;
        String trash = "";
        System.out.println("Enter the temperature in Celcius: ");

        if(in.hasNextDouble())
        {
            tempCelcius = in.nextDouble();
            tempFahren = (tempCelcius * 9/5) +32;
            System.out.println("The temperature in Fahrenheit is: " + tempFahren);
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number.");
        }
    }
}