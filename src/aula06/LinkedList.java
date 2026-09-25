package aula06;

public class LinkedList<T> {
    Node head;

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void insertFirst(T data) {
        var newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertEnd(T data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        var currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        var temp = head;
        var currentNode = temp.next;
        while (currentNode != null && currentNode.next != null) {
            temp = currentNode;
            currentNode = temp.next;
        }
        temp.next = null;
    }

    public boolean contains(T data) {
        var temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T get(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public T peekFirst() {
        return head != null ? head.data : null;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }

    public int size() {
        int contador = 0;
        var temp = head;
        while (temp != null) {
            contador++;
            temp = temp.next;
        }
        return contador;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void remove(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        var current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void insertAt(int index, T data) {
        if (index == 0) {
            insertFirst(data);
            return;
        }

        var newNode = new Node(data);
        var current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int search(T data) {
        var temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
}