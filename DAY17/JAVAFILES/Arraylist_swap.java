import java.util.*;
public class Arraylist_swap {
    public static void main(String args[]){
        ArrayList<String> colors=new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLACK");
        colors.add("WHITE");
        colors.add("PINK");
        System.out.println("Before Swap :"+" "+colors);
        var value_1=colors.get(0);
        var value_2=colors.get(2);

        colors.set(0,value_2);
        colors.set(2,value_1);
        System.out.println("After Swap :"+" "+colors);

    }
}
