import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj pierwsze imię: ");
        String FirstName = keyboard.nextLine();

        System.out.println("Podaj drugie imię: ");
        String MiddleName = keyboard.nextLine();

        System.out.println("Podaj nazwisko: ");
        String ThirdName = keyboard.nextLine();

        char FirstInitial = FirstName.charAt(0);
        char SecondInitial = MiddleName.charAt(0);
        char ThirdInitial = ThirdName.charAt(0);

        System.out.println("Masz na imię: " + FirstName);
        System.out.println("Twoje drugie imię to: " + MiddleName);
        System.out.println("Twoje nazwisko: " + ThirdName);

        System.out.println(FirstInitial + " | " + SecondInitial + " | " + ThirdInitial);
    }
}
