import java.util.Scanner;

public class sumofcube {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        cubenumber(number);
    }
    public static void cubenumber(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int output = i*i*i;
            sum=sum+output;

        }
        System.out.print("sum of cube numbers is"+" "+sum);
    }
}
