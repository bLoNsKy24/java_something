import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("gimme the value of the gift: ");
            double gift = Double.valueOf(input.nextLine());

            if (gift >= 0 && gift < 5000) {
                System.out.println("no tax !");
            } else if (gift >= 5000 && gift < 25000) {
                double tax = 100;
                double exceeding_tax = (gift - 5000) * 0.08;
                double total_tax = tax + exceeding_tax;
                System.out.printf("total tax: %.4f%n", total_tax);
            } else if (gift >= 25000 && gift < 55000) {
                double tax = 1700;
                double exceeding_tax = (gift - 25000) * 0.10;
                double total_tax = tax + exceeding_tax;
                System.out.printf("total tax: %.4f%n", total_tax);
            } else if (gift >= 55000 && gift < 200000) {
                double tax = 4700;
                double exceeding_tax = (gift - 55000) * 0.12;
                double total_tax = tax + exceeding_tax;
                System.out.printf("total tax: %.4f%n", total_tax);
            } else if (gift >= 200000 && gift < 1000000) {
                double tax = 22100;
                double exceeding_tax = (gift - 200000) * 0.15;
                double total_tax = tax + exceeding_tax;
                System.out.printf("total tax: %.4f%n", total_tax);
            } else if (gift == 1000000) {
                double tax = 142100;
                double exceeding_tax = (gift - 1000000) * 0.17;
                double total_tax = tax + exceeding_tax;
                System.out.printf("total tax: %.4f%n", total_tax);
            } else {
                System.out.println("no one sends gifts of that price range !");
            }
        }
    }
}