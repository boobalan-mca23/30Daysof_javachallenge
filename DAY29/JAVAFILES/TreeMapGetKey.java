import java.util.*;
public class TreeMapGetKey {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put("c2","red");
        tm.put("c3","green");
        tm.put("c1","pink");
        tm.put("c4","white");
        System.out.println("ORIGINAL TREEMAP KEYS AND VALUES"+" " +tm);
        System.out.println("TREEMAP FIRST KEY :"+tm.firstKey());
        System.out.println();
        System.out.println("TREEMAP LAST KEY :"+tm.lastKey());
    }
}
