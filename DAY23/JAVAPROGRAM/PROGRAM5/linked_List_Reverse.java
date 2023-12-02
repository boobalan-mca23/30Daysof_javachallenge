public class linked_List_Reverse {
    public static void main(String args[]){
        Linked_list list=new Linked_list();

        list.insertAtBegining(6);
        list.insertAtBegining(5);
        list.insertAtBegining(4);
        list.insertAtBegining(3);
        list.insertAtBegining(2);
        list.insertAtBegining(1);
        System.out.println("ORIGINAL LINKED LIST :");
        list.display();
        System.out.println();
        System.out.println("LINKED LIST REVERSE :");
        list.reverse();
        list.display();
    }
}
