package week4;

public abstract class Pet {
    private String name ;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void run();

    public void test1(){

        run();
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Pet(){
        }
}
