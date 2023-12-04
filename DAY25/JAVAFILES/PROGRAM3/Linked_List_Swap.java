public class Linked_List_Swap {
    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        System.out.println("ORIGINAL LINKED LIST :");
        list.insertAtBegining(6000);
        list.insertAtBegining(5000);
        list.insertAtBegining(4000);
        list.insertAtBegining(3000);
        list.insertAtBegining(2000);
        list.insertAtBegining(1000);
        list.display();
        System.out.println();

        System.out.println("AFTER SWAPED LINKED LIST");
        list.swap(1,6);
        list.display();
    }
}
