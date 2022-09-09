import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj swoje ulubione miasto: ");
        String CityName = keyboard.nextLine();

        int Chars = CityName.length();
        System.out.println(Chars);

        String Lower = CityName.toLowerCase();
        System.out.println(Lower);

        String Upper = CityName.toUpperCase();
        System.out.println(Upper);

        char First = CityName.charAt(0);
        System.out.println(First);
    }
}
