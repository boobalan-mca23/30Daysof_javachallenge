import java.util.Scanner;
public class natural {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sumnatural(n);
    }
    public static void sumnatural(int n){
        int sum=0;
        int number=1;
        while(number<=n){
            sum=sum+number;
            number=number+1;
        }
        System.out.println("the sum of natural number is " + sum);
    }
}
