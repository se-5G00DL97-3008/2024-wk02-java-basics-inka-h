import java.util.Scanner;

class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = askNumber(scanner, "How many bottles of beer? ");
        scanner.close();

        for (int beer = userNumber; beer > 0; beer--) {
            if (beer > 1) {
                System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer.");
                System.out.print("Take one down and pass it around, ");
                if (beer - 1 > 1) {
                    System.out.println((beer - 1) + " bottles of beer on the wall.");
                } else {
                    System.out.println("1 bottle of beer on the wall.");
                }
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, " + userNumber + " bottles of beer on the wall!");
            }
        }
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