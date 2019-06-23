package week4;

public class Dog extends Pet{
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Dog(String name, int age, char sex) {
        super(name, age);
        this.sex = sex;
    }

    public Dog() {

    }
    public  void run(){
        System.out.println("狗叫");
    }
}

