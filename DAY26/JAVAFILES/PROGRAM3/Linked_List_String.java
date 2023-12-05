public class Linked_List_String {

        Node head;

        class Node {
            String value;
            Node next;

            Node(String val) {
                value = val;
                next = null;
            }
        }

        Linked_List_String() {
            head = null;
        }
    public void display(){
        if(head==null){
            System.out.println("THE LINKED LIST  IS EMPTY");
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value +" ");
            temp=temp.next;
        }

    }

    public void add(String val){
        Node newnode=new Node(val);

        if(head==null){
            head=newnode;
        }
        else{
            int length=length();


            Node temp=head;
            for(int i=1;i<=length;i++){
                if(temp.next==null){
                    temp.next=newnode;
                }
                else{
                    temp=temp.next;
                }

            }
        }
    }
    public int length(){
        Node temp=head;
        int length=0;
        while(temp!=null){

            temp=temp.next;
            length++;
        }
        return length;
    }

    public String get(int pos){
        String value=" ";
        pos=pos-1;

        if(pos==0){
            Node temp=head;
            value=temp.value;

        }
        if(pos>=1){
            Node temp=head;
            for(int i=1;i<=pos;i++){
                temp=temp.next;
            }
            value=temp.value;
        }
        return value;
    }
    public void set(int pos,String value){
            pos=pos-1;

            if(pos==0){
                Node temp=head;
                temp.value=value;
            }
            if(pos>=1){
                Node temp=head;
                for(int i=1;i<=pos; i++){
                    temp=temp.next;
                }
                temp.value=value;
            }
    }


}
