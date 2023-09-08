import java.util.Scanner;
public class sumofdigit {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        findsum(number);
    }
    static void findsum(int m){
        int n=m;
        int sum=0;
        while(n!=0){
            int y=n%10;
            sum=sum+y;
            n=n/10;
        }
        System.out.print("THE SUMOFDIGIT IS :"+" "+sum);
    }
}
