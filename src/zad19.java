import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ile ciastek robimy?: ");
        int cookies = keyboard.nextInt();
        double sugar, flour;
        int butter;

        sugar = (cookies*1.5)/48;
        butter = (cookies*1)/48;
        flour = (cookies*2.75)/48;
        System.out.println(sugar);
        System.out.println(butter);
        System.out.println(flour);
    }
}
