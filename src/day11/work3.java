package day11;

public class work3 {
    public static void main(String[] args) {
        String str="我爱android编程，android也爱我";
        char a='爱';
        int i=0,j=0;
        while (j<str.length()) {
            int index = str.indexOf('爱', j);
            if (index==-1){
               return; }
            j = index;i++;
        }System.out.println(i);
    }
}