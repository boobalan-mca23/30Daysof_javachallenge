import java.util.Scanner;
public class Delete_element {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your position");
        int position=sc.nextInt();
        int arr[]={1,2,3,4,5};

        removeelement(arr,position);
    }
    public static void removeelement(int arr[],int position){
        position=position-1;
        for(int i=0;i<arr.length;i++){
            if (i==position){
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for(int k=0;k<arr.length-1;k++){
            System.out.println(arr[k]);
        }
    }
}
