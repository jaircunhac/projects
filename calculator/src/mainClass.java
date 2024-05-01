import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        equations eq = new equations();

        char letter;
        System.out.println("What equation do you want to solve?");
        System.out.println("Addition, Subtract, Division or Multiplication");
        letter = sc.next().charAt(0);

        // Using the if statement to bring the user to the correct parte of the code
        if (letter == 'A' | letter == 'a'){
            System.out.println("Please insert the numbers you want to add in the order below: ");
            System.out.println("x + y");
            System.out.print("Numbers: ");
            eq.x = sc.nextDouble();
            eq.y = sc.nextDouble();
            eq.addition();
        } else if (letter == 'S' | letter == 's') {
            System.out.println("Please insert the numbers you want to subtract in the order below: ");
            System.out.println("x - y");
            System.out.print("Numbers: ");
            eq.x = sc.nextDouble();
            eq.y = sc.nextDouble();
            eq.subtract();
        } else if (letter == 'D' | letter == 'd') {
            System.out.println("Please insert the numbers you want to divide in the order below: ");
            System.out.println("x / y");
            System.out.print("Numbers: ");
            eq.x = sc.nextDouble();
            eq.y = sc.nextDouble();
            eq.division();
        } else if (letter == 'M' | letter == 'm') {
            System.out.println("Please insert the numbers you want to multiply in the order below: ");
            System.out.println("x * y");
            System.out.print("Numbers: ");
            eq.x = sc.nextDouble();
            eq.y = sc.nextDouble();
            eq.multiplication();
        } else {
            System.out.println("Invalid Answer");
        }
        sc.close();
    }
}
