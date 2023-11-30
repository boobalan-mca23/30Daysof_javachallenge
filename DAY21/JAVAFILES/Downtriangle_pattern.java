public class Downtriangle_pattern {
    public static void main(String args[]){

        int maxcount=4;
        int i=1;
        int count=1;
        while(count<=4){
            while(i<=maxcount){
                System.out.print("*"+" ");
               i++;
            }
            i=1;
            maxcount=maxcount-1;
            count++;
            System.out.println();


        }



    }
}
