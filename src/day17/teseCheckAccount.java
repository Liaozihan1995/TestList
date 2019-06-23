package day17;

import java.util.Scanner;

public class teseCheckAccount {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("请输入账号");
            int id=input.nextInt();
            System.out.println("请输入余额");
            double balance=input.nextInt();
            System.out.println("请输入年利率");
            double annualInterestRate=input.nextDouble();
            System.out.println("请输入可透支额度");
            double overdraf=input.nextDouble();
            CheckAccount checkaccount=new CheckAccount(id,balance,annualInterestRate,overdraf);
            while (true){
                System.out.println("\n请选择操作");
                System.out.println("1.返回月利率");
                System.out.println("2.取款");
                System.out.println("3.存款");
                int choose=input.nextInt();
                switch (choose){
                    case 1:
                        double monthlyInterest=checkaccount.getMonthlyInterest();
                        System.out.println(monthlyInterest);
                        break;
                    case 2:
                        System.out.println("请输入取款金额");
                        double withdraw=input.nextDouble();
                        boolean result=checkaccount.withdraw(withdraw);
                        System.out.println(result==true?"取款成功，你的账户余额为"+checkaccount.getBalance()+
                                " 你的可透支额度为："+checkaccount.getOverdraft() :
                                "可透支额度不足！\n你的账户余额为:"+checkaccount.getBalance()+
                                        " 你的可透支额度为："+checkaccount.getOverdraft());
                        break;
                    case 3:
                        System.out.println("请输入存款金额");
                        double deposit=input.nextDouble();
                        checkaccount.setBalance(checkaccount.getBalance()+deposit);
                        System.out.println("存款成功，你的余额为："+checkaccount.getBalance());
                        break;
                    default:
                        break;
                }
            }
        }
}

