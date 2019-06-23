package day18;

public class FoodManager {


    Food[] foods=new Food[500];
    int count=0;
    public boolean addfood(Food food){
        if (food==null){
            return false;
        }
        if (count>=500){
            return false;
        }
        Food result =this.findfood(food.getName());
        if (result!=null){
            return false;
        }else{
            foods[count++] = food;}
        return true;
    }
    public Food findfood(String name){
        for(int i=0;foods[i]!=null&&i<count;i++){
            if (foods[i].getName().equals(name)){
                return foods[i];
            }
        }
        return null;
    }

    public Food[] findallfood(){
        Food foods2[]=new Food[count];
        for(int i=0;i<count;i++){
            foods2[i]=foods[i];
        }
        return foods2;
    }
    public boolean updatefood(Food food){
        for(int i=0;i<count;i++){
            if (foods[i].getName().equals(food.getName())){
                foods[i]=food;
            }
            return true;
        }
        return false;
    }
    public double allprice(){
        double allprice=0;
        for(int i=0;i<count;i++){
         allprice+=foods[i].getPrice()*foods[i].getCount();
        }
        return allprice;
    }
    public Food[] highestfood(){
        double max=0;
        for(int i=0;i<count;i++){
            if (foods[i].getPrice()>max){
                max=foods[i].getPrice();
            }
        }
        int count1=0;
        for(int i=0;i<count;i++){
            if (foods[i].getPrice()==max){
                count1++;
            }
        }
        Food[] foods2=new Food[count1];
        for(int i=0;i<count;i++){
            int a=0;
            if (foods[i].getPrice()==max){
                foods2[a]=foods[i];
                a++;
            }
        }
        return foods2;
    }
    public void sort(){
        for(int i=0;i<count-i;i++){
            for(int j=0;j<count-i-1;j++){
             if (foods[j+1].getPrice()<foods[j].getPrice()){
                 Food a=foods[j];
                 foods[j]=foods[j+1];
                 foods[j+1]=a;
             }
            }
        }
    }

}
