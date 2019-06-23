package work;

import java.util.Arrays;

public class test3 { public static void main(String[] args) {
    System.out.println("正在初始化数组...");
    int [] arr=new int [100000];
    for (int b = 0; b < arr.length; b++) {
        arr[b] = (int) (Math.random() * 100000); //生成随机数并存放到数组中
    }
    System.out.println("初始化完成，开始排序...");

    long begin = System.currentTimeMillis(); //获取当前时间的毫秒
    for(int i=1;i<100000;i++){
        int a=arr[i];
        int j=i;
        for(;j>0&&arr[j-1]>a;j--){
            arr[j]=arr[j-1];
        }
        arr[j]=a;
    }
    System.out.println(Arrays.toString(arr));
    long end = System.currentTimeMillis();
    System.out.println("排序完成，耗时：" + (end - begin) + "毫秒");
}

}
