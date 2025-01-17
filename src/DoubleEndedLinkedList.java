public class DoubleEndedLinkedList {

    private Node first; // ref to first node on list
    private Node last;  // ref to last node on list

    public DoubleEndedLinkedList() { // constructor
        first = null; // no items on list yet
        last = null;
    }

    public boolean isEmpty() {
        return (first == null); // true if the list is empty
    }

    // Method to insert at the end of the list
    public void insertLast(int data) {
        Node newNode = new Node(data); // create a new node
        if (isEmpty()) {
            first = newNode; // if empty, first and last refer to the new node
        } else {
            last.next = newNode; // link the last node to the new node
        }
        last = newNode; // update the last reference
    }

    // Method to insert at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data); // create a new node
        if (isEmpty()) {
            last = newNode; // if empty, first and last refer to the new node
        }
        newNode.next = first; // link the new node to the former first node
        first = newNode; // update the first reference
    }

    // Method to display the list
    public void displayList() {
        Node current = first; // start at the beginning of the list
        while (current != null) {
            System.out.print(current.iData + " "); // print data
            current = current.next; // move to the next node
        }
        System.out.println();
    }

    public Node deleteFirst(){
        if(isEmpty()){
            return null;
        }

        Node temp = first;

        if(first.next == null){
            last =null;
        }

        first = first.next;

        return temp;
    }

    public Node deleteLast(){
        if(isEmpty()){
            return null;
        }

        Node temp = last;

        if(first==last){
            first = last = null;
        }else{
            Node current = first;
            while (current.next!=last){
                current = current.next;
            }
            last = current;
            current.next = null;
        }

        return temp;

    }

    public void insertAfter(int data, int afterKey){
        Node newNode = new Node(data);

        Node current = first;

        while (current!=last){
            if(current.iData!=afterKey){
                current = current.next;
            }else {
                break;
            }

        }

        newNode.next = current.next;
        current.next = newNode;

    }

    public void deleteMiddle(int data){
        Node current = first;
        Node previousCurrent = first;

        while(current!=last){
            if(current.iData != data){
                previousCurrent = current;
                current=current.next;
            }else {
                break;
            }
        }

        previousCurrent.next = current.next;

    }


    public static void main(String[] args) {
        DoubleEndedLinkedList list = new DoubleEndedLinkedList();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertFirst(05);
        list.insertFirst(35);
        list.insertFirst(25);
        list.insertFirst(15);
        list.displayList(); // Output should be: 5 10 20

        list.deleteFirst();
        list.displayList();

        list.deleteLast();
        list.displayList();

        list.insertAfter(100,5);
        list.displayList();

        list.deleteMiddle(100);
        list.displayList();
    }
}
