import java.util.Scanner;
public class sum_avg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr);
        averge(arr);

    }
    public static void sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("SUM OF ARRAY IS "+" "+sum);
    }
    public static void averge(int []arr){
        int len=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int avg=sum/len;
        System.out.println("AVERGE OF ARRAY IS "+" "+avg);


    }
}
