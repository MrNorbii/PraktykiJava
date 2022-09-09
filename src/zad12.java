import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę ciasteczek w pudełku: ");
        int box = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj liczbę zjedzonych ciasteczek: ");
        int cookies = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj liczbę porcji: ");
        int piortons = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj liczbę kalorii: ");
        int calories = keyboard.nextInt();
        keyboard.nextLine();

        int CaloriesEqual = calories * piortons;
        int CookieCalories = CaloriesEqual / box;
        int CookiesEqual = cookies * CookieCalories;

        System.out.println(box + " | " + cookies + " | " + piortons + " | " + calories);
//        System.out.println(CaloriesEqual + " kalorii");
        System.out.println("Jedno ciasteczko ma: " + CookieCalories + " kalorii");
        System.out.println("Zjadłem: " + CookiesEqual + " kalorii");
    }
}
