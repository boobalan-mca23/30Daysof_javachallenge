import java.util.*;
public class MapDesendingKeySet {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put("c2","red");
        tm.put("c3","green");
        tm.put("c1","pink");
        tm.put("c4","white");

        System.out.println("ORIGINAL MAP kEYS :"+" "+tm);

        Set s=tm.descendingKeySet();

        System.out.println();


        System.out.println("REVERSED MAP kEYS :"+" "+s);






    }
}
