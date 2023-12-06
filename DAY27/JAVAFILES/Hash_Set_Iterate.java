import java.util.*;
public class Hash_Set_Iterate {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(100);
        set.add(2);
        set.add(1);
        set.add(300);
        set.add(21);
        set.add(6);

        Iterator<Integer>hs= set.iterator();
        System.out.println(" iterate each element in Hashset using Iterator Interface ");
        while(hs.hasNext()){
            System.out.print(hs.next()+" ");
        }


    }
}
