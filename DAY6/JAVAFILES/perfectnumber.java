import java.util.Scanner;
public class perfectnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        checkperfect(number);
    }
    static void checkperfect(int number){
        int sumfactors=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sumfactors=sumfactors+i;
            }
        }
        if(number==sumfactors){
            System.out.println( number +" its a perfect number");
        }
        else{
            System.out.println(number  + " its a not perfect number");
        }
    }
}
