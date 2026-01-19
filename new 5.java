import java.util.Scanner;

public class MonthNumberProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the month number: ");
            int monthNumber = Integer.parseInt(scanner.nextLine());

            if (isValidMonthNumber(monthNumber)) {
                System.out.println("Entered month number: " + monthNumber);
            } else {
                throw new NumberFormatException("Invalid month number. It should be between 1 and 12.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidMonthNumber(int monthNumber) {
        return monthNumber >= 1 && monthNumber <= 12;
    }
}
