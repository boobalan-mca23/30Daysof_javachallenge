import java.util.Scanner;
public class position {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the all elements");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        System.out.println("Enter the element you want to find:");
        int element=sc.nextInt();
        searchindex(arr,element);
    }
    public static void searchindex(int []arr,int element){
         for(int i=0;i<arr.length;i++){
             if(element==arr[i]){
                 i=i+1;
                 System.out.println("Element found at position:"+i);
                 break;
             }
        }
    }
}
