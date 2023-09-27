import java.util.Scanner;
public class Removeduplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        removeduplicate(arr);
    }
    public static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void removeduplicate(int []arr){
        int max=largest(arr);
        max=max+1;

        int index=0;

        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            for(int j=i+1;j<arr.length;j++){

                if(k==arr[j]){
                   arr[j]=max;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=max){
               System.out.print(arr[k]+" ");
            }
        }

    }
}




