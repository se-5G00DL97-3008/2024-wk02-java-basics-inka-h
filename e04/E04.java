import java.util.Scanner;

class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = -1;
        while (day < 1 || day > 31) {
            day = askNumber(scanner, "Enter a day: ");
        }

        int month = -1;
        while (month < 1 || month > 12) {
            month = askNumber(scanner, "Enter a month: ");
        }
        scanner.close();

        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas");
        }
    }

    private static int askNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Please enter an integer.");
                scanner.next();
            }
        }
    }
}