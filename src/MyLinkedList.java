/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 10/8/13
 * Time: 1:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;

    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean add(E element) {
        Node<E> nodeToBeAdded = new Node<E>(element, null);

        if (first == null) {
            first = nodeToBeAdded;
        } else {
            last.next = nodeToBeAdded;
        }
        last = nodeToBeAdded;

        size++;

        return true;
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
        if (index > size - 1) {
            throw new IndexOutOfBoundsException(index + ": Invalid Index");
        }
        Node<E> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public int indexOf(E element) {
        return 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += "[" + get(i) + "]";
        }
        return result;
    }

    private class Node<E> {
        public E value;
        public Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        System.out.println(myLinkedList.add(1));
        System.out.println(myLinkedList.add(2));
        System.out.println(myLinkedList);
    }
}
