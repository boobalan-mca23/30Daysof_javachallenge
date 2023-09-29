import java.util.Scanner;
public class merge_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array length");
        int first=sc.nextInt();
        int firstarr[]=new int[first];
        System.out.println("Enter first array elements");
        for(int i=0;i<firstarr.length;i++){
            firstarr[i]=sc.nextInt();
        }
        System.out.println("Enter second array length");
        int second=sc.nextInt();
        int secondarr[]=new int[second];
        System.out.println("Enter second array elements");
        for(int j=0;j<secondarr.length;j++){
            secondarr[j]=sc.nextInt();
        }
        merge(firstarr,secondarr);
    }
    public static void merge(int f[],int s[]){
        int flen=f.length;
        int slen=s.length;
        int newlen=flen+slen;
        int mergearr[]=new int[newlen];
        int index=0;


        for(int i=0;i<f.length;i++){
            mergearr[index]=f[i];
            index++;
        }
        for(int j=0;j<s.length;j++){
            mergearr[index]=s[j];
            index++;
        }
        sort(mergearr);
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
