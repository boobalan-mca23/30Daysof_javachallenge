public class Linked_List_Compare {
    public static void main(String[] args) {
        Linked_List_String list_1=new Linked_List_String();
        System.out.println("FIRST LINKED LIST");
        list_1.add("Red");
        list_1.add("Green");
        list_1.add("Black");
        list_1.add("White");
        list_1.add("Pink");
        list_1.display();
        System.out.println();

        Linked_List_String list_2=new Linked_List_String();
        System.out.println("FIRST LINKED LIST");
        list_2.add("Red");
        list_2.add("Green");
        list_2.add("Black");
        list_2.add("Orange");

        list_2.display();
        System.out.println();

        Linked_List_String newlist=new Linked_List_String();
        boolean booleanvalue=false;

        int size_1= list_1.length();
        int size_2= list_2.length();

        for(int i=1;i<=size_1;i++){
            String value_1=list_1.get(i);
            for(int j=1;j<=size_2;j++){
                String value_2=list_2.get(j);

                if(value_1==value_2){
                    newlist.add("YES");
                    booleanvalue=true;
                    break;
                }
            }
            if(booleanvalue==false){
                newlist.add("NO");
            }
            booleanvalue=false;
        }
        System.out.println();
        System.out.println("COMPARED LINKED LIST");
        newlist.display();

    }
}
