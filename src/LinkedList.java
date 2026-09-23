public class LinkedList {
    Node head;

    static class Node {
        Aluno aluno;
        Node next;

        public Node(Aluno aluno) {
            this.aluno = aluno;
        }
    }

    public void insertFirst(Aluno aluno) {
        var newNode = new Node(aluno);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertEnd(Aluno aluno) {
        var newNode = new Node(aluno);
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

    public boolean contains(String matricula) {
        var temp = head;
        while (temp != null) {
            if (temp.aluno.getMatricula().equals(matricula)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Aluno get(String matricula) {
        Node current = head;
        while (current != null) {
            if (current.aluno.getMatricula().equals(matricula)) {
                return current.aluno;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.aluno.toString());
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

    public void remove(String matricula) {
        if (head == null) return;

        if (head.aluno.getMatricula().equals(matricula)) {
            head = head.next;
            return;
        }

        var current = head;
        while (current.next != null) {
            if (current.next.aluno.getMatricula().equals(matricula)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void insertAt(int index, Aluno aluno) {
        if (index == 0) {
            insertFirst(aluno);
            return;
        }

        var newNode = new Node(aluno);
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

    public int search(String matricula) {
        var temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.aluno.getMatricula().equals(matricula)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
}