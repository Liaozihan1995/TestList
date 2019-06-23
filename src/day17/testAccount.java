package day17;

import java.util.Scanner;

public class testAccount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入账号");
        int id=input.nextInt();
        System.out.println("请输入余额");
        double balance=input.nextInt();
        System.out.println("请输入年利率");
        double annualInterestRate=input.nextDouble();
        Account account=new Account(id,balance,annualInterestRate);
        while (true){
        System.out.println("\n请选择操作");
        System.out.println("1.返回月利率");
        System.out.println("2.取款");
        System.out.println("3.存款");
        int choose=input.nextInt();
        switch (choose){
            case 1:
                double monthlyInterest=account.getMonthlyInterest();
                System.out.println(monthlyInterest);
                break;
            case 2:
                System.out.println("请输入取款金额");
                double withdraw=input.nextDouble();
                boolean result=account.withdraw(withdraw);
                System.out.println(result==true?"取款成功，你的账户余额为"+account.getBalance():
                        "余额不足！\n你的账户余额为:"+account.getBalance());
                break;
            case 3:
                System.out.println("请输入存款金额");
                double deposit=input.nextDouble();
                account.setBalance(account.getBalance()+deposit);
                System.out.println("存款成功，你的余额为："+account.getBalance());
                break;
                default:
                    break;
        }
        }
    }
}
