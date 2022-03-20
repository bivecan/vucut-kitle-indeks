import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz: ");
        double boy = input.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();

        double bmi = kilo / (boy*boy);

        System.out.println("Vücut Kitle Indeksiniz: " + bmi);
    }
}
