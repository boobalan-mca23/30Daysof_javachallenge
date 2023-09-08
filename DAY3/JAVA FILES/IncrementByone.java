import java.util.Scanner;
public class IncrementByone {
    static int newnumber=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        increment(number);
        print(newnumber);

    }
    static void increment(int m){


        int y;
        int n=m;
        while(n!=0){
            y=n%10;
            y=y+1;
            newnumber=newnumber*10+y;
            n=n/10;
        }

    }
    static void print(int newm){
        int newn=newm;
        while(newn!=0){
            int k=newn%10;
            System.out.print(k);
            newn=newn/10;
        }
    }
}




