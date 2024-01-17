import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double userNumber = askNumber(scanner, "Enter a number: ");
        scanner.close();

        if (userNumber >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

private static double askNumber(Scanner scanner, String prompt) {
    while (true) {
        System.out.println(prompt);
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Please enter a number.");
            scanner.next();
        }
    }
}
}