package day17;

public class Account {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    private int id;
    private double balance;
    private double annualInterestRate;
    public double getMonthlyInterest(){
        double monthlyInterest=this.getAnnualInterestRate()/12;
        return monthlyInterest;
    }
    public boolean withdraw (double amount){
        if (amount>this.getBalance()){
            return false;
        }
        else{this.setBalance(this.getBalance()-amount);
            return true;}

    }
    public void deposit (double amount){
        this.setBalance(this.getBalance()+amount);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account(){

    }
}
