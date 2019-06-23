package day13;

public class test2 {

    public String panduan(int a, int b) {
        String result = "";
        if ((a == 1 & b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
            result = "你赢了";
        } else if ((a == 1 & b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            result = "你输了";
        } else if (a == b) {
            result = "平局";
        }
        return result;
    }
    public String person(int c){
        String name="";
        if (c==1){
            name="刘备";
        }
        if (c==2){
            name="孙权";
        }
        if (c==3){
            name="曹操";
        }
        return name;
    }
    public String leixing(int d){
        String chenhu="";
        if (d==1){
            chenhu="剪刀";
        }
        if (d==2){
            chenhu="石头";
        }
        if (d==3){
            chenhu="布";
        }
        return chenhu;
    }
}
