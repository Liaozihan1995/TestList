package work;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
    int [] arr={2,3,4,1,5,6,};
    for(int i=0;i<arr.length;i++){
        int min=i;
        for(int j=i;j<arr.length-1;j++){
            if(arr[j+1]<arr[min]){
                min=j+1; }
        }int a=arr[i];
        arr[i]=arr[min];
        arr[min]=a;
    }

}
}
