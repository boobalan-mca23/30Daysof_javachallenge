import java.util.Scanner;
public class sumofevenodd {
    static int n,sumofEven,sumofodd=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        sum(array);
        System.out.println("The sumofeven is"+" "+sumofEven);
        System.out.println("The sumofodd is"+" "+sumofodd);

    }
    static void sum(int array[]){
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                sumofEven= sumofEven+array[i];
            }
            else{
                sumofodd=sumofodd+array[i];
            }
        }
    }
}
