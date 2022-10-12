import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String YorNAnswer = "";
        double tempCelcius = 0;
        double tempFahren = 0;
        String trash = "";
        boolean more = true;

        do {
            System.out.println("Enter the temperature in Celcius: ");

            if (in.hasNextDouble())
            {
                tempCelcius = in.nextDouble();
                tempFahren = (tempCelcius * 9/5) +32;
                System.out.println("The temperature in Fahrenheit is: " + tempFahren);
                more = false;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered the wrong input for Celcius: " + trash);
                continue;
            }
        }
        while(more);
    }
}