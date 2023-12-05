public class Linked_List_Replace {
    public static void main(String[] args) {

        Linked_List_String list=new Linked_List_String();
        System.out.println("ORIGINAL LINKED LIST :");
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.display();
        System.out.println();
        System.out.println();
        System.out.println("SET NEW VALUE IN 2 POSITION");
        list.set(2,"orange");
        list.display();
        System.out.println();
        System.out.println();
        System.out.println("SET NEW VALUE IN LAST POSITION");
        list.set(5,"Blue");
        list.display();


    }
}
