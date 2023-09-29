import java.util.Scanner;
import java.util.Arrays;

public class union_intersection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  1 array length");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter  1 array elements");
        for (int i = 0; i <arr1.length ; i++) {
           arr1[i]=sc.nextInt();
        }
        System.out.println("Enter  2 array length");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter  2 array elements");
        for (int j = 0; j <arr2.length ; j++) {
            arr2[j]=sc.nextInt();
        }
        union(arr1,arr2);
        intersection(arr1,arr2);

    }
    public static void union(int arr1[],int arr2[]){
        int len1=arr1.length;
        int len2=arr2.length;
        int newlen=len1+len2;
        int unionarr[]=new int[newlen];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            unionarr[index]=arr1[i];
            index++;
        }
        for(int j=0;j<arr2.length;j++){
            unionarr[index]=arr2[j];
            index++;
        }
       System.out.println("Union ="+" "+Arrays.toString(unionarr));

    }
    public static void intersection(int []arr1,int []arr2){

        int intersectionarr[]=new int[2];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    intersectionarr[index]=arr1[i];
                    index++;
                    break;
                }
            }
        }
        System.out.println("Intersection="+" "+Arrays.toString(intersectionarr));
    }

}
