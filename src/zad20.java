import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int PERCENT = 100;
        System.out.println("Podaj kwotę pierwotną: ");
        double P = keyboard.nextDouble();
        System.out.println("Roczna stopa oprocentowania: ");
        double r = keyboard.nextDouble()/PERCENT;
        System.out.println("Ilość kapitalizacji: ");
        double n = keyboard.nextDouble();
        System.out.println("Liczba lat: ");
        double t = keyboard.nextDouble();

        double equal = (Math.pow(((r / n) + 1), n*t)) * P; //P(1+r/n) nt
        System.out.println(equal);
    }
}
