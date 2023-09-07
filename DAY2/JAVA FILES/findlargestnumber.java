import java.util.Scanner;
public class findlargestnumber {
    static int n1,n2,n3=0;
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        n1=sc.nextInt();
        System.out.println("Enter the second number:");
        n2=sc.nextInt();
        System.out.println("Enter the third number:");
        n3=sc.nextInt();
        findlargest(n1,n2,n3);
    };
    static void findlargest(int n1,int n2,int n3){
        if(n1>n2 && n1>n3){
            System.out.println("Largest Number :"+n1);
        } else if (n2>n3) {
            System.out.println("Largest Number :"+n2);
        }
        else{
            System.out.println("Largest Number :"+n3);
        }
    }
}
