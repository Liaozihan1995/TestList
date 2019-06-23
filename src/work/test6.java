package work;

import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 1, 5, 2,};
        for(int i=1;i<arr.length;i++){
            int j=i;
            int min=arr[i];
            for(;j>0&&arr[j-1]>min;j--){
                arr[j]=arr[j-1];
            }arr[j]=min;
        }System.out.println(Arrays.toString(arr));
    }
}