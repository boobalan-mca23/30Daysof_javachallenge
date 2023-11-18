import java.util.Scanner;
public class Pyramidpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lines");
        int line=sc.nextInt();
        pattern(line);
    }
    public static void pattern(int line){
        int space=line;
        int i=1;
        int j=1;
        int count=1;
        while(count<=line){
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            while(j<=count){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            count++;
            space=space-1;
            i=1;
            j=1;
        }

    }
}
