import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = askNumber(scanner, "Give a number: ");
        double b = askNumber(scanner, "Give a number: ");

        scanner.close();

        printResult(a, b, " + ", a + b);
        printResult(a, b, " - ", a - b);
        printResult(a, b, " x ", a * b);
        if (!isZero(b)) {
            printResult(a, b, " / ", a / b);
        } else {
            System.out.println("Can't divide by zero.");
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

private static void printResult(double a, double b, String operation, double result) {
    if (isInteger(a) && isInteger(b)) {
        System.out.println((int) a + operation + (int) b + " = " + (int) result);
    } else {
        System.out.println(a + operation + b + " = " + result);
    }
}

private static boolean isInteger(double value) {
    return value == Math.floor(value) && !Double.isInfinite(value);
}

private static boolean isZero(double value) {
    if (value == 0) {
        return true;
    } else {
        return false;
    }
}
}