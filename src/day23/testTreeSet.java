package day23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class testTreeSet {
    public static void main(String[] args) {
        TreeSet<Worker> tree = new TreeSet<>(new MyComparator());
        Worker worker1 = new Worker("zhang3", 18, 1500);
        Worker worker2 = new Worker("li4", 18, 1500);
        Worker worker3 = new Worker("wang5", 18, 1600);
        Worker worker4 = new Worker("liu6", 17, 2000);

        tree.add(worker1);
        tree.add(worker2);
        tree.add(worker3);
        tree.add(worker4);
        Iterator iterator=tree.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    private static class MyComparator implements Comparator<Worker>{

        @Override
        public int compare(Worker o1, Worker o2)
        {
            if (o1.getAge() != o2.getAge()){
            return o1.getAge() - o2.getAge();
            }
            else if (o1.getAge() == o2.getAge()&&o1.getSalary()!=o2.getSalary()){
                return (int)(o1.getSalary() - o2.getSalary());
            }
            return 0;
            /*else if (o1.getAge() == o2.getAge()&&o1.getSalary()==o2.getSalary()){
                return (int)(o1.getName()-o2.getName().);
            }*/

        }

    }
}