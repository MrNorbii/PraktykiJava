public class zad6 {
    public static void main(String[] args) {
        int mnozenie1 = 3*4;
        int pomieszczenie1 = mnozenie1;

        int mnozenie2 = 3*4;
        int pomieszczenie2 = mnozenie2;

        int mnozenie3 = 2*3;
        int pomieszczenie3 = mnozenie3;

        int mnozenie4 = 2*2;
        int pomieszczenie4 = mnozenie4;

        int CalkowitaPowierzchnia = mnozenie1 + mnozenie2 + mnozenie3 + mnozenie4;
        int osoba = 4;

        double PowierzchniaNaOsobe = (double)CalkowitaPowierzchnia / osoba;

        System.out.println("Wymiary pomieszczeń: \n" + pomieszczenie1 +
                "\n" + pomieszczenie2 + "\n" + pomieszczenie3 + "\n" + pomieszczenie4);
        System.out.println("Łączna powierzchnia: " +CalkowitaPowierzchnia);
        System.out.println("Powierzchnia na osobę: " + PowierzchniaNaOsobe + " m2");
    }
}
