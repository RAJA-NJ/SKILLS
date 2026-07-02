import java.util.Scanner;

class SimpleCal {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();

        System.out.println("\n\tChoose The Operation");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");

        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Result: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Result: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Result: " + (n1 * n2));
                break;

            case 4:
                if (n2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    double result = (double) n1 / n2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scan.close();
    }
}