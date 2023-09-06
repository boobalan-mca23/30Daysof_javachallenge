import java.util.Scanner;
public class Even_or_Odd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        Check(number);

    }
    public static void Check(int number){
        if(number%2==0){
            System.out.println("Given number "+" "+number  + " is Even ");
        }
        else{
            System.out.println("Given number "+" "+number  + " is Odd ");
        }
    }
}
