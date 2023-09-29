import java.util.Scanner;
public class numberofoccurance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element of which you want to count number of occurrences:");
        int userchoice=sc.nextInt();
        numberofcount(arr,userchoice);

    }
    public static int maximum(int []arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void  numberofcount(int []arr,int userchoice){
        int max=maximum(arr);
        max=max+1;
        for(int i=0;i<arr.length;i++){
            int val1=arr[i];
            int count=1;
            if(val1!=max){
                for(int j=i+1;j<arr.length;j++){
                    int val2=arr[j];
                    if(val1==val2){
                        count++;
                        arr[j]=max;
                    }
                }
                if(count==userchoice){
                    System.out.println("Number of Occurrence of the element:"+" "+val1);
                }


            }
            count=1;
        }
    }
}
