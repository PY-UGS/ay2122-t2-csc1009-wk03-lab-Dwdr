import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {

        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date(); 

    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); 

    }

    public double getannualInterestRate(){
        return annualInterestRate;
    }
    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getnumberOfYears(){
        return numberOfYears;
    }
    public void setnumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getloanAmount(){
        return loanAmount;
    }
    public void setloanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public Date getloanDate(){
        return loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = (this.annualInterestRate/100) / 12;
        return ((this.loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, (this.numberOfYears * 12))))));
    }
    public double getTotalPayment(){
        return this.getMonthlyPayment() * this.numberOfYears * 12;
    }
}


