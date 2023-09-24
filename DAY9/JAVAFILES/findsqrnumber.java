import java.util.Scanner;
public class findsqrnumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        sqrnumber(number);
    }
    public static void sqrnumber(int n){
        for(int i=1;i<=n;i++){
            int output=i*i;
            System.out.print(output+" ");
        }
    }
}
