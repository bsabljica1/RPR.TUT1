package ba.unsa.etf;
import java.util.Scanner;

public class Main {

    private static int sumaCifara (int n) {
        int temp=n;
        int suma=0;
        while (temp>0) {
            suma+=temp%10;
            temp/=10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println ("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i=2; i<n; i++) if (i%sumaCifara(i)==0) System.out.println(i);
    }
}
