import java.util.Scanner;
public class checkPosNeg {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int number=sc.nextInt();
        check(number);
    }
    static void check(int number){
        if(number>0){
            System.out.println("The Given Number    "  + number+   "  is Positive ");
        }
        else if(number<0){
            System.out.println("The Given Number    "  + number+    "    is Negative ");
        }
        else{
            System.out.println("The Given Number    "  + number+    "        is Neither Positive nor Negative ");
        }
    }

}
