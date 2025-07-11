package projeto_6.application;

import projeto_6.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double boughtDollar = sc.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.reais(dollarPrice, boughtDollar));

        sc.close();
    }
}
