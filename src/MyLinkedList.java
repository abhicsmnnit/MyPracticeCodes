/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 10/8/13
 * Time: 1:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyLinkedList<E> {
    private Node first;
    private Node last;

    private int size;

    public MyLinkedList()
    {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean add(E element) {
        return false;
    }

    public boolean remove(E element) {
        return false;
    }

    public boolean remove(int index) {
        return false;
    }

    public int size() {
        return 0;
    }

    public void clear() {
    }

    public boolean contains(E element) {
        return false;
    }

    public E get(int index) {
        return null;
    }

    public int indexOf(E element) {
        return 0;
    }

    private class Node<E> {
        public E value;
        public Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
    }
}
