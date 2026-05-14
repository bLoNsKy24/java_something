import java.util.Scanner;

public class proto_calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Choose shape: ");
        String shape = input.next();
        if (shape.equals("circle")) {
            System.out.println("radius: ");
            double radius = input.nextDouble();
            double circumference = 2 * pi * radius;
            System.out.printf("circumference: %.4f%n", circumference);
            double area = pi * radius * radius;
            System.out.printf("area: %.4f%n", area);
        } else if (shape.equals("sphere")) {
            System.out.println("radius: ");
            double radius = input.nextDouble();
            double surface_area = 4 * pi * radius * radius;
            System.out.printf("surface_area: %.4f%n", surface_area);
            double curved_surface_area = 4 * pi * radius * radius;
            System.out.printf("curved_surface_area: %.4f%n", curved_surface_area);
            double volume = 4.0 / 3.0 * pi * radius * radius * radius;
            System.out.printf("volume: %.4f%n", volume);
        } else if (shape.equals("hemisphere")) {
            System.out.println("radius: ");
            double radius = input.nextDouble();
            double surface_area = 2 * pi * radius * radius;
            System.out.printf("surface_area: %.4f%n", surface_area);
            double curved_surface_area = 3 * pi * radius * radius;
            System.out.printf("curved_surface_area: %.4f%n", curved_surface_area);
            double volume = 2.0 / 3.0 * pi * radius * radius * radius;
            System.out.printf("volume: %.4f%n", volume);
        } else if (shape.equals("square")) {
            System.out.println("side: ");
            double side = input.nextDouble();
            double perimeter = 4.0 * side;
            System.out.printf("perimeter: %.4f%n", perimeter);
            double area = side * side;
            System.out.printf("area: %.4f%n", area);
        } else if (shape.equals("cube")) {
            System.out.println("side: ");
            double side = input.nextDouble();
            double surface_area = 6.0 * side * side;
            System.out.printf("surface_area: %.4f%n", surface_area);
            double lateral_surface_area = 4.0 * side * side;
            System.out.printf("lateral_surface_area: %.4f%n", lateral_surface_area);
            double volume = side * side * side;
            System.out.printf("volume: %.4f%n", volume);
        } else if (shape.equals("rectangle")) {
            System.out.println("length: ");
            double length = input.nextDouble();
            System.out.println("breadth: ");
            double breadth = input.nextDouble();
            double perimeter = 2.0 * (length + breadth);
            System.out.printf("perimeter: %.4f%n", perimeter);
            double area = length * breadth;
            System.out.printf("area: %.4f%n", area);
        } else if (shape.equals("cuboid")) {
            System.out.println("length: ");
            double length = input.nextDouble();
            System.out.println("breadth: ");
            double breadth = input.nextDouble();
            System.out.println("height: ");
            double height = input.nextDouble();
            double surface_area = 2.0 * (length * breadth + breadth * height + height * length);
            System.out.printf("surface_area: %.4f%n", surface_area);
            double lateral_surface_area = 2.0 * height * (length + breadth);
            System.out.printf("lateral_surface_area: %.4f%n", lateral_surface_area);
            double volume = length * breadth * height;
            System.out.printf("volume: %.4f%n", volume);
        } else if (shape.equals("triangle")) {
            System.out.println("slant_side_a: ");
            double side_a = input.nextDouble();
            System.out.println("slant_side_b: ");
            double side_b = input.nextDouble();
            System.out.println("base: ");
            double side_c = input.nextDouble();
            System.out.println("height: ");
            double side_d = input.nextDouble();
            double perimeter = side_a + side_b + side_c;
            System.out.printf("perimeter: %.4f%n", perimeter);
            double area = 1.0 / 2.0 * side_c * side_d;
            System.out.printf("area: %.4f%n", area);
        } else if (shape.equals("cone")) {
            System.out.println("radius: ");
            double radius = input.nextDouble();
            System.out.println("height: ");
            double height = input.nextDouble();
            double slant_height = Math.sqrt(radius * radius + height * height);
            double surface_area = pi * radius * (slant_height + radius);
            System.out.printf("surface_area: %.4f%n", surface_area);
            double curved_surface_area = pi * radius * slant_height;
            System.out.printf("curved_surface_area: %.4f%n", curved_surface_area);
            double volume = 1.0 / 3.0 * pi * radius * radius * height;
            System.out.printf("volume: %.4f%n", volume);
        } else if (shape.equals("cylinder")) {
            System.out.println("radius: ");
            double radius = input.nextDouble();
            System.out.println("height");
            double height = input.nextDouble();
            double surface_area = 2.0 * pi * radius * (height + radius);
            System.out.printf("surface_area: %.4f%n", surface_area);
            double curved_surface_area = 2.0 * pi * radius * height;
            System.out.printf("curved_surface_area: %.4f%n", curved_surface_area);
            double volume = pi * radius * radius * height;
            System.out.printf("volume: %.4f%n", volume);
        } else {
            System.out.println("that shape is coming soon!\n" + "or, maybe its just a typo.");
        }
    }
}