import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What color do you want?");
        String color = inputScanner.nextLine();

        if (color.equals("B")) {
            System.out.println("You have chosen blue");
        } else if (color.equals("G")) {
            System.out.println("You have chosen green");
        } else if (color.equals("R")) {
            System.out.println("You have chosen red");
        } else {
            System.out.println("Unknown color" + " : " + color);
        }
    }
}

