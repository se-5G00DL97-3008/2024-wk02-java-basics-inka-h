import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = -5;
        while (userNumber != 0) {
            userNumber = askNumber(scanner, "Give a number (0 to quit): ");

            if (userNumber == 0) {
                break;
            }

            if (userNumber % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
            System.out.println();
            }
            scanner.close();
        }



private static int askNumber(Scanner scanner, String prompt) {
    while (true) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Please enter a number.");
            scanner.next();
        }
    }
}
}