public class LinkedList {
    ListClass head = null;

    protected void insertItem(int data){
        ListClass obj = new ListClass(data);

        if(head == null){
            head = obj;
            return;
        }

        ListClass temp = head;

        while (temp.head != null){
            temp = temp.head;
        }

        temp.head = obj;

    }

    protected void display(){
        ListClass temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.head;
        }
    }
}
