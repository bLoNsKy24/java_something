import java.util.Scanner;
public class Program{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme a string: ");
        String str = input.nextLine();
        System.out.println(str);
        System.out.println("Gimme an integer: ");
        int integer = Integer.valueOf(input.nextLine());
        System.out.println(integer);
        System.out.println("Gimme a double: ");
        double doub = Double.valueOf(input.nextLine());
        System.out.println(doub);
        System.out.println("Gimme a boolean");
        boolean bool = Boolean.valueOf(input.nextLine());
        System.out.println(bool);
        System.out.println("you gave the string " + str);
        System.out.println("you gave the integer " + integer);
        System.out.println("you gave the " + doub);
        System.out.println("you gave the " + bool);
    }
}