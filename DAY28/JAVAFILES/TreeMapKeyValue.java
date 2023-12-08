import java.util.*;
public class TreeMapKeyValue {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(1,"red");
        tm.put(2,"green");
        tm.put(3,"black");
        tm.put(4,"white");
        tm.put(5,"blue");
        Set s=tm.entrySet();

        Iterator i=s.iterator();

        while (i.hasNext()){
            Map.Entry me=(Map.Entry)i.next();

            System.out.println(me.getKey()+"----->"+me.getValue());
        }
    }
}
