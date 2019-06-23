package day13;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args){
        System.out.println("出拳规则：1.剪刀 2.石头 3.布");
        System.out.println("请选择对方角色：1.刘备 2.孙权 3.曹操");
        Scanner input=new Scanner(System.in);
        int c=input.nextInt();
        test2 i=new test2();          //激活类
        String name1=i.person(c);               //调用方法
        System.out.println("请输入你的名字");
        String name=input.next();
        System.out.println(name+"VS"+name1+"对战");
        System.out.println("要开始了吗？（Y/N）");
        String y_n=input.next();
        System.out.println("请出拳");
        int d=input.nextInt();
        String zhonglei1=i.leixing(d);                 //调用方法
        System.out.println("你出拳是"+zhonglei1);
        int f=(int)(Math.random()*2+1);
        String zhonglei2=i.leixing(f);                   //调用方法
        System.out.println("曹操出拳是"+zhonglei2);
        String jieguo=i.panduan(f,d);                     //调用方法
        System.out.println("结果是"+jieguo);
    }
}