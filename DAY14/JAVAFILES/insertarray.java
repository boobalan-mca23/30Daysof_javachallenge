import java.util.Scanner;
public class insertarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your array length");
        int len=sc.nextInt();
        System.out.print("Enter your array");

        int array[]=new int[len];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter your position");
        int position=sc.nextInt();

        System.out.print("Enter your value");
        int value=sc.nextInt();

        insert(array,position,value);
    }

    public static void insert(int arr[],int position,int value){
        int new_array[]=new int [arr.length+1];

        for(int i=0;i<position;i++){


            new_array[i]=arr[i];

        }
        new_array[position]=value;
        for(int j=position+1;j<new_array.length;j++){
            new_array[j]=arr[j-1];
        }
        for(int k=0;k<=new_array.length-1;k++){
            System.out.print(new_array[k]+" ");
        }

    }




}
