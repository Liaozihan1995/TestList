package day18;


import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        FoodManager fm=new FoodManager();
         Food food1=new Food("牛肉干",12,5);
        Food food2=new Food("果冻",4,7);
        Food food3=new Food("豆腐干",2,2);
        fm.addfood(food1);
        fm.addfood(food2);
        fm.addfood(food3);

        System.out.println("欢迎");
        while (true){
            System.out.println("请选择：");
            System.out.println("1.新增食品信息");
            System.out.println("2.查询所有食品信息");
            System.out.println("3.根据食品名称查询食品信息");
            System.out.println("4.根据食品名称修改食品信息");
            System.out.println("5.统计所有食品的总价");
            System.out.println("6.统计最贵的食品信息");
            System.out.println("7.根据食品价格升序排序，价格相同的按数量降序排序");
            System.out.println("8.退出");
            int choose =input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("请输入食品名称");
                    String name = input.next();
                    System.out.println("请输入食品价格");
                    double price = input.nextDouble();
                    System.out.println("请输入库存数量");
                    int count = input.nextInt();
                    Food food=new Food(name,price, count);
                    boolean result=fm.addfood(food);
                    System.out.println(result==true?"添加成功":"添加失败");
                    break;
                case 2:
                    Food[] foods=fm.findallfood();
                    if (null == foods || foods.length == 0) {
                        System.out.println("暂无商品信息");
                    } else {
                        System.out.println("名称\t价格\t库存数量");
                        for (int i = 0; i < foods.length; i++) {
                            Food f = foods[i];
                            System.out.println(f.getName() +
                                    "\t" + f.getPrice() + "\t" + f.getCount());
                    }
                    }
                    break;
                case 3:


                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:


                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }
}
