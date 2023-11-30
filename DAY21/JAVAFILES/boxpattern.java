
public class boxpattern {
    public static void main(String args[]){
        int count=1;
        int maxcount=6;
        int space=1;
        int maxspace=17;
        for(int i=1;i<=10;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        while(count<=maxcount){
            System.out.print("*");
            while(space<=maxspace){
                System.out.print(" ");
                space++;
            }
            System.out.print("*");

            System.out.println();
            space=1;
            count++;

        }
        for(int j=1;j<=10;j++){
            System.out.print("*"+" ");
        }
    }
}
