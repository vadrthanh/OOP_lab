import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid year. Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next(); // clear the invalid input
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.print("Enter month: ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    validInput = true;
                } else {
                    System.out.println("Invalid month. Please enter a number between 1 and 12.");
                }
            } else {
                String monthStr = scanner.next();
                month = getMonthFromString(monthStr);
                if (month != -1) {
                    validInput = true;
                } else {
                    System.out.println("Invalid month. Please enter a valid month.");
                }
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);
    }

    public static int getMonthFromString(String monthStr) {
        switch (monthStr.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
                return 1;
            case "february":
            case "feb.":
            case "feb":
                return 2;
            case "march":
            case "mar.":
            case "mar":
                return 3;
            case "april":
            case "apr.":
            case "apr":
                return 4;
            case "may":
                return 5;
            case "june":
            case "jun.":
            case "jun":
                return 6;
            case "july":
            case "jul.":
            case "jul":
                return 7;
            case "august":
            case "aug.":
            case "aug":
                return 8;
            case "september":
            case "sep.":
            case "sep":
                return 9;
            case "october":
            case "oct.":
            case "oct":
                return 10;
            case "november":
            case "nov.":
            case "nov":
                return 11;
            case "december":
            case "dec.":
            case "dec":
                return 12;
            default:
                return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 != 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}


