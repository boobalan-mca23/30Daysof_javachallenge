import java.util.Scanner;
public class sumofsqrnumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        sqrnumber(number);
    }
    public static void sqrnumber(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int output = i * i;
            sum=sum+output;

        }
        System.out.print("sum of squre numbers is"+" "+sum);
    }
}
