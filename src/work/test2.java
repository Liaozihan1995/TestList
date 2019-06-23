package work;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        System.out.println("正在初始化数组...");
        int [] arr=new int [100000];
        for (int b = 0; b < arr.length; b++) {
            arr[b] = (int) (Math.random() * 100000); //生成随机数并存放到数组中
        }
        System.out.println("初始化完成，开始排序...");

        long begin = System.currentTimeMillis(); //获取当前时间的毫秒
        for (int i=0;i<arr.length;i++){
            int min=i;
             for(int j=i+1;j<arr.length;j++){
                 if (arr[min]>arr[j]){
                     min=j;}
             }
            int a = arr[i];  //交换位置
            arr[i] = arr[min];
            arr[min] = a;

        }
        System.out.println(Arrays.toString(arr));
        long end = System.currentTimeMillis();
        System.out.println("排序完成，耗时：" + (end - begin) + "毫秒");
    }

}
