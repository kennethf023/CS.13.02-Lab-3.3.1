import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CISQueue {

    private Queue<Integer> queue;

    public CISQueue() {
        this.queue=new LinkedList<>();
    }

    public void enqueue(int num){
        queue.add(num);
    }
    public int dequeue(){
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public String toString(){
        String s = "";
        s = s + "CISQueue{queue=" + queue;
        s = s + ", size=" + queue.size() + "}";
        return s;
    }
    // Linked list property.

    // Size property.

    // Constructor.

    // Enqueue. This method adds a node to the end of the linked list.

    // Dequeue. This method removes a node from the beginning of the linked list.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}

}
