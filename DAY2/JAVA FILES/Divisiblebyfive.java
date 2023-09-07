import java.util.Scanner;
public class Divisiblebyfive {
    static int number=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any number");
        number=sc.nextInt();
        check(number);

    }
    static void check(int number){
        if(number%5==0){
            System.out.println(number + " is divisible by 5");
        }
        else{
            System.out.println(number + " is  not divisible by 5");
        }
    }
}
