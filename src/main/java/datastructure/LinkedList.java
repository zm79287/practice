package datastructure;

/**
 * 链表
 */
public class LinkedList {

    private Node first;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);
        node.setNext(first);

        first = node;
    }

    public Node find(int value) {
        Node node = first;
        while (node.getValue() != value) {
            if ((node = node.getNext()) == null) {
                return null;
            }
        }
        return node;
    }

    public void delete(int value) {
        Node node = first;
        Node preNode = null;
        while (node != null) {
            if (node.getValue() == value) {
                Node nextNode = node.getNext();
                preNode.setNext(nextNode);
                break;
            }
            preNode = node;
            if ((node = node.getNext()) == null) {
                break;
            }

        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(4);

        System.out.println(linkedList);

        Node node = linkedList.getFirst();
        System.out.println(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getValue());
        }

        System.out.println(linkedList.find(3).getValue());
        System.out.println();
        System.out.println();
        System.out.println();

        linkedList.delete(2);
        node = linkedList.getFirst();
        System.out.println(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getValue());
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                '}';
    }

    class Node {
        private int value;

        private Node next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
