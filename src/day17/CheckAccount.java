package day17;

public class CheckAccount extends Account{
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public CheckAccount() {
    }

    public boolean withdraw(double amount){
        if (amount<this.getBalance()){
            this.setBalance(this.getBalance()-amount);
            return true;
        }
        else{
            if ((amount-this.getBalance())<this.getOverdraft()){
                this.setOverdraft(this.getOverdraft()-amount+this.getBalance());
                this.setBalance(0);
                return true;
            }
            else{
                return false;}
        }
    }
}
