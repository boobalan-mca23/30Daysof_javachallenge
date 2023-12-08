import java.util.*;
public class TreemapContains {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(1,"red");
        tm.put(2,"green");
        tm.put(3,"black");
        tm.put(4,"white");
        tm.put(5,"blue");

        if(tm.containsValue("green")){
            System.out.println("The TreeMap Contains Value Green");
        }
        else{
            System.out.println("The TreeMap Does Not Contains Value Green");
        }
        if(tm.containsValue("pink")){
            System.out.println("The TreeMap Contains Value Pink");
        }
        else{
            System.out.println("The TreeMap Does Not Contains Value Pink");
        }
    }
}
