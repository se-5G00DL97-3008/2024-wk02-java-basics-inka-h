import java.util.Scanner;

class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = askNumber(scanner, "Enter a number:");
        String day = "weekday";

        switch (number) {
            case 1:
                day = "Mon";
                break;
            case 2:
            day = "Tue";
                break;
            case 3:
            day = "Wed";
                break;
            case 4:
            day = "Thu";
                break;
            case 5:
            day = "Fri";
                break;
            case 6:
            day = "Sat";
                break;
            case 7:
            day = "Sun";
                break;
            default:
                day = "Only 7 days in a week";
                break;
        }
        System.out.println(day);
    }

    private static int askNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Please enter an integer between 1 and 7.");
                scanner.next();
            }
        }
    }
}