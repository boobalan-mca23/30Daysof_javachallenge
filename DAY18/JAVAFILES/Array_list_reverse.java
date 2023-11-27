import java.util.*;
public class Array_list_reverse {
    public static  void main (String []args){
        ArrayList<String> countries=new ArrayList<>();

        countries.add("FRANCE");
        countries.add("NEWZALAND");
        countries.add("PAKISTAN");
        countries.add("INDIA");
        System.out.println("Before  list : " +" "+countries);
         reverse(countries);


    }
    public static void reverse(ArrayList<String>countries){
        int i=0;
        int j=countries.size()-1;

        while (i<j){
            String val1=countries.get(i);
            String val2=countries.get(j);

            String temp=val1;
            val1=val2;
            val2=temp;

            countries.set(i,val1);
            countries.set(j,val2);

            i++;
            j--;
        }
        System.out.println("After reversed list :"+" "+countries);
    }

}
