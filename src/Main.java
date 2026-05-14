import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gimme your grades:");
        int grades = input.nextInt();
        if (grades < 0) {
            System.out.println(" impossible!");
        } else if (grades <= 49) {
            System.out.println("failed.");
        } else if (grades <= 59) {
            System.out.println("1");
        } else if (grades <= 69) {
            System.out.println("2");
        } else if (grades <= 79) {
            System.out.println("3");
        } else if (grades <= 89) {
            System.out.println("4");
        } else if (grades <= 100) {
            System.out.println("5");
        } else {
            System.out.println("impossible");
        }
    }
}