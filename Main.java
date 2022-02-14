import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        loan.setannualInterestRate(input.nextDouble());
        System.out.print("Enter number of years as an integer: ");
        loan.setnumberOfYears(input.nextInt());
        System.out.print("Enter loan amount, for example, 120000.95: ");
        loan.setloanAmount(input.nextDouble());
        input.close();
        Double monthlyPayment = loan.getMonthlyPayment();
        Double totalPayment = loan.getTotalPayment();
        System.out.println("The loan was created on " + loan.getloanDate());
        System.out.printf("The monthly payment is %.2f\n", monthlyPayment);
        System.out.printf("The total payment is %.2f\n", totalPayment);
    }
}

