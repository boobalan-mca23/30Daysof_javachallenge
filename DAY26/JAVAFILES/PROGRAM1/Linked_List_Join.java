public class Linked_List_Join {
    public static void main(String[] args) {
        Linked_list list_1=new Linked_list();
        System.out.println("FIRST LINKED LIST");
        list_1.add(1);
        list_1.add(2);

        list_1.add(3);
        list_1.display();
        System.out.println();
        Linked_list list_2=new Linked_list();
        System.out.println("SECOND LINKED LIST");
        list_2.add(4);
        list_2.add(5);
        list_2.add(6);
        list_2.display();
        System.out.println();
        Linked_list newlist=new Linked_list();
        int size_1= list_1.length();
        int size_2= list_2.length();

        for(int i=1;i<=size_1;i++){
            int value=list_1.get(i);
            newlist.add(value);

        }
        for(int j=1;j<=size_2;j++){
            int value=list_2.get(j);
            newlist.add(value);

        }
        System.out.println("AFTER JOINED TWO LINKED LIST");

        newlist.display();

    }
}
