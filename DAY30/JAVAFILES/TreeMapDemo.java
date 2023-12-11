import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(10,"Red");
        tm.put(20,"Green");
        tm.put(30,"White");
        tm.put(40,"Pink");
        tm.put(50,"Yellow");
        System.out.println("original key values "+" "+tm);
        System.out.println();
        System.out.println("key 20 greater than keyvalues are "+" "+tm.tailMap(20,false));



    }

}
