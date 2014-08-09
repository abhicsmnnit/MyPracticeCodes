package algo;

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
        }
        else {
            last.next = nodeToBeAdded;
        }
        last = nodeToBeAdded;

        size++;

        return true;
    }

    public boolean remove(E element) {
        return remove(indexOf(element));
    }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            return false;
        }

        if (first == last) { // Only one node in the list
            first = null;
            last = null;
        }
        else {
            Node<E> predecessorNode = getNodeAt(index - 1);
            if (predecessorNode == null) { // First node to be deleted
                first = first.next;
            }
            else if (predecessorNode.next == last) { // Last node to be deleted
                last = predecessorNode;
                last.next = null;
            }
            else {
                predecessorNode.next = predecessorNode.next.next;
            }
        }
        size--;
        return true;
    }

    private Node<E> getNodeAt(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        Node<E> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException(index + ": Invalid Index");
        }
        Node<E> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public int indexOf(E element) {
        if (element == null) {
            return -1;
        }

        int index = -1;
        for (Node<E> iterator = first; iterator != null; iterator = iterator.next) {
            index++;
            if (element.equals(iterator.value)) {
                return index;
            }
        }
        return -1;
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
}
