package day23;

import java.util.Comparator;
import java.util.Objects;

public class Worker implements Comparable<Worker> {
    private String name;
    private int age;
    private double salary;
    public Worker (){}
    public Worker (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println(name +  "work");
    }

    @Override
    public String toString() {
        return "工人{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 工资=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age &&
                Double.compare(worker.salary, salary) == 0 &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }


    @Override
    public int compareTo(Worker o) {
        return o.age-this.age;
    }
}
