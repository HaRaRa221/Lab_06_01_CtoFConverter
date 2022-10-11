import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String YorNAnswer = "";
        double tempCelcius = 0;
        double tempFahren = 0;
        String trash = "";
        boolean done = true;

        do {
            System.out.println("Enter the temperature in Celcius: ");
            if (in.hasNextDouble)
            {
                tempCelcius = in.nextDouble;
                in.nextLine();
                if (tempCelcius = double)
                {
                    tempFahren = (tempCelcius * 9/5) +32;
                    System.out.println("The temperature in Fahrenheit is: " + tempFahren);

                }
                else
                {
                    System.out.println("You must enter a number for Celcius.);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a number in Celcius. You entered: " + trash);
            }

            System.out.println("Do you have another number to enter. [Y/N]");
            if (YorNAnswer.equalsIgnoreCase("N")
            {
                done = true;
            }
            else
            {
                continue;
            }
        }while (!done)
    }
}
