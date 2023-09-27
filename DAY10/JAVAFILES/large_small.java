import java.util.Scanner;
public class large_small {
    public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a array length");
     int n=sc.nextInt();
     System.out.println("Enter a array elements");
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     sort(arr);
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        secondlargest(arr);
        smallest(arr);
    }
    public static void secondlargest(int arr[]){
        int output1=arr.length-2;
        System.out.println("Second largest"+" "+arr[output1]);
    }
    public static void  smallest(int arr[]){
        int output2=arr[0];
        System.out.println("Smallest"+" "+output2);
    }
}
