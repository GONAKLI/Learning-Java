import java.util.Scanner;

class MonthOfYear {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to month finder");
        System.out.println("now, enter month number ");
        int number = input.nextInt();

        String month = switch (number){
            case 1 -> "January" ;
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println("Month is: " + month);
    }
}
