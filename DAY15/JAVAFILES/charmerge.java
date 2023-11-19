public class charmerge {
    public static void main(String args[]){
        System.out.print("Before Merging  two characters array");
        System.out.println();

        char first_arr[]={'a','b','c','d'};

        for(int k=0;k<first_arr.length;k++){
            System.out.print(first_arr[k]+" ");
        }
        System.out.println();

        char second_arr[]={'w','x','y','z'};
        for(int m=0;m<second_arr.length;m++){
            System.out.print(second_arr[m]+" ");
        }
        System.out.println();
        mergechar(first_arr,second_arr);

    }
    public static void mergechar(char [] arr1,char []arr2){
        int new_length=arr1.length+arr2.length;
        char new_array[]=new char[new_length];

        int position=0;

        for(int i=0;i<arr1.length;i++){
            new_array[i]=arr1[i];
            position++;
        }
        for(int j=0;j<arr2.length;j++){
            new_array[position]=arr2[j];
            position++;
        }

        System.out.println("After Merging two characters array");
        System.out.println();
        for(int k=0;k<new_array.length;k++){
            System.out.print(new_array[k]+" ");
        }


    }
}
