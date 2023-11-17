
import java.util.Scanner;
public class starpattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines ");
        int input = sc.nextInt();
        starprint(input);
    }
    public static void  starprint(int input){

        int space=input;
        int count=1;

        int j=1;
        while (count<=input) {
            while (j<=space){
                System.out.print(" ");
                j++;
            }
            for(int i=1;i<=count;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
            space=space-1;
            count=count+1;
            j=1;
        }
    }
}
