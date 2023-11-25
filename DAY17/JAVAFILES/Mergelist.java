import java.util.*;
public class Mergelist {
    public static void main(String args[]){
        ArrayList<String> List1=new ArrayList<>();
        List1.add("a");
        List1.add("b");
        System.out.println(" List 1 :"+ "  " + List1);

        ArrayList<String> List2=new ArrayList<>();
        List2.add("c");
        List2.add("d");
        System.out.println(" List 2 :"+ "  " + List2);

        ArrayList<String> newlist=new ArrayList<>();

        var element=" ";
        for(int i=0;i< List1.size();i++){
             element=List1.get(i);
            newlist.add(element);
        }
        for(int j=0;j< List2.size();j++){
             element=List2.get(j);
            newlist.add(element);
        }
        System.out.println(" Merged List :"+ "  " + newlist);


    }
}
