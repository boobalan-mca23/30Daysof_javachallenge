import java.util.*;
public class TreeMap_Keys_Values {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(1,"red");
        tm.put(2,"green");
        tm.put(3,"black");
        tm.put(4,"white");
        tm.put(5,"blue");

        System.out.println("original TreeMap "+" "+tm);
        System.out.println();
        Set s=tm.keySet();

        System.out.println("Tree map keys:"+s);
        System.out.println();
        Collection c=tm.values();

        System.out.println("Tree map values:"+c);


//        Iterator i= c.iterator();
//
//        while (i.hasNext()){
//            Object value=i.next();
//
//            if()
//        }
    }
}
