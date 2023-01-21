import java.util.Scanner;

public class EndeksHesaplama {
    public static void main(String[] args) {
        double kg,m,toplam;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen kilonuzu girin:");
        kg=input.nextDouble();
        System.out.print("Lütfen boyunuzu girin:");
        m=input.nextDouble();

        toplam=kg/(m*m);
        System.out.print("Toplam boy kilo endekseniz "+toplam);

    }
}
