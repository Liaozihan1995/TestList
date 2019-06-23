package day23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("Tom","Corejava");
        map.put("John","Oracle");
        Object a=map.get("Tom");
        System.out.println(a);
        System.out.println(map.containsKey("Tom"));
         Set<String> b=map.keySet();
		for (String string : b) {    //通过foreach遍历集合
			System.out.println(string);
		}
        Collection<String> c=map.values();
        for (String string : c) {    //通过foreach遍历集合
            System.out.println(string);
        }


    }
}
