import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = askNumber(scanner, "Which multiplication table to show?");
        int times = askNumber(scanner, "Until which multiplier should the table show?");
        scanner.close();


        for (int i = 0;i <= times; i++) {
            System.out.println(i + " x " + number + " = " + (i*number));
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