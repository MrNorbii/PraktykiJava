import java.util.Scanner;

public class zad3if {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double bmi;
        System.out.println("Podaj wagę: ");
        double weight = keyboard.nextDouble();
        System.out.println("Podaj wzrost: ");
        double height = keyboard.nextDouble();
        final double HEIGHT = height/100;

        bmi = weight/Math.pow(HEIGHT, 2);

        System.out.print("Twoje BMI: ");
        System.out.println(bmi);

        if (bmi>18.5 && bmi<25)
        {
            System.out.println("BMI optymalne!");
        }
        else if (bmi<18.5)
        {
            System.out.println("Zbyt niskie BMI!");
        }
        else if (bmi>25)
        {
            System.out.println("Zbyt wysokie BMI!");
        }
    }
}
