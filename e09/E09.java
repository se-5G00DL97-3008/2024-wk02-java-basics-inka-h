import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = 0;
        double total = 0;
        int count = 1;

        while (userNumber != -1) {
            userNumber = askNumber(scanner, "Give a test score (-1 to quit): ");

            if (userNumber == -1) {
                break;
            } else {
                total += userNumber;
                double average = (total / count);
                System.out.println("Average: " + average);
                count +=1;
            }
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