import java.util.Scanner;

public class zad6if {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int seconds = keyboard.nextInt();

        int minutes = seconds/60;
        int hours = minutes/60;
        int days = hours/24;

        System.out.println(seconds + " sekund to " + minutes + " minut to " + hours + " godzin to " + days + " dni.");
    }
}
