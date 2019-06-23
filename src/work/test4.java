package work;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,5,6,};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j+1]<arr [j]){
                    int a=arr[j+1];
                    arr[j+1]=arr [j];
                    arr [j]=a;
                }
            }
        }System.out.println(Arrays.toString(arr));
    }
}
