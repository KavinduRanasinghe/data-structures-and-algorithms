public class DoublyNode {
    private int iData;
    private DoublyNode next;
    private DoublyNode previous;


    //constructor for the very first node
    public DoublyNode(int data){
        iData = data;
        next = previous = null;
    }


    //constructor for rest of other nodes
    public DoublyNode(int data,DoublyNode previousNode,DoublyNode nextNode){
        iData = data;
        next= nextNode;
        previous=previousNode;
    }

    private int getData(){
        return iData;
    }

    private DoublyNode getNext(){
        return next;
    }

    private DoublyNode getPrevious(){
        return previous;
    }
}
