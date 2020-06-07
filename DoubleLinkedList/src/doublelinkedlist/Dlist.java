package doublelinkedlist;

public class Dlist {

    Node head;

    public  void printList(Dlist list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList 
        while (currNode != null) {
            // Print the data at current node 
            System.out.print(currNode.data + " ");

            // Go to next node 
            currNode = currNode.next;
        }
        System.out.println("");
    }

    public  int size(Dlist list) {
        Node currentNode = list.head;
        int count = 1;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }
        return count;

    }

    public  Dlist insertLast(Dlist dList, int data) {

        Node newNode = new Node(data);
        if (isEmpty(dList)) {
            dList.head = newNode;
            return dList;
        }
        Node currentnode = dList.head;
        while (currentnode.next != null) {

            currentnode = currentnode.next;
        }

        currentnode.next = newNode;
        newNode.prev = currentnode;
        return dList;
    }

    public  Dlist insertFirst(Dlist dList, int data) {
        Node newNode = new Node(data);
        if (isEmpty(dList)) {
            dList.head = newNode;
            return dList;
        }
        dList.head.prev = newNode;
        newNode.next = dList.head;
        dList.head = newNode;
        return dList;
    }

    public  Dlist insertAfterNode(Dlist dList, int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 0 || pos > size(dList) - 1) {
            System.out.println("The given previous node cannot be less than 0 or larger then size");
            return dList;
        }
        Node currNode = dList.head;
        int count = 0;
        for (int i = 0; i < pos; i++) {
            currNode.prev = currNode;
            currNode = currNode.next;

        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        newNode.prev = currNode;
        return dList;

    }

    public  Dlist insertBeforeNode(Dlist dList, int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 0 || pos > size(dList) - 1) {
            System.out.println("The given previous node cannot be less than 0 or larger then size");
            return dList;
        }
        Node currNode = dList.head;
        for (int i = 0; i < pos; i++) {
            currNode.prev = currNode;
            currNode = currNode.next;

        }
        newNode.prev = currNode.prev;
        currNode.prev.next = newNode;
        currNode.prev = newNode;
        newNode.next = currNode;
        return dList;
    }

    public  Dlist deleteatPos(Dlist dList, int pos) {
        Node currNode = dList.head;
        //delete first
        if (pos == 0) {
            dList.head = dList.head.next;
            dList.head.prev = null;
            return dList;
        }

        // delete last
        if (pos == dList.size(dList) - 1) {
            Node last = findNodeAtPos(dList, pos);
            last.prev.next = null;
            return dList;
        }
        for (int i = 0; i < pos; i++) {
            currNode.prev = currNode;
            currNode = currNode.next;
        }
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
        return dList;

    }

    public  Dlist deletNode(Dlist dList, int data) {
        Node currNode = dList.head;
        // delete first
        if (dList.head.data == data) {
            dList.head = dList.head.next;
            dList.head.prev = null;
            return dList;
        }
        // delete last
        if (data == findNodeAtPos(dList, size(dList) - 1).data) {
            Node last = findNodeAtPos(dList, size(dList) - 1);
            last.prev.next = null;
            return dList;
        }
        while (currNode != null && currNode.data != data) {
            currNode.prev = currNode;
            currNode = currNode.next;
        }
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
        return dList;
    }

    public  Node findNodeAtPos(Dlist list, int pos) {
        if (pos == 0) {

            return list.head;
        } else if (pos > size(list) - 1 || pos < 0) {

            return null;
        } else {
            Node currentNode = list.head;

            int count = 0;
            for (int i = 0; i < pos; i++) {

                currentNode = currentNode.next;
            }

            return currentNode;
        }

    }

    public  boolean isEmpty(Dlist list) {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public  Dlist reverse(Dlist list) {

        if (isEmpty(list)) {
            return list;
        }
        Node currenNode = list.head;
        Node newHead = list.head;
        while (currenNode != null) {
            Node tempNode = currenNode.prev;
            currenNode.prev = currenNode.next;
            currenNode.next = tempNode;
            newHead = currenNode;
            currenNode = currenNode.prev;

        }
        list.head = newHead;
        return list;
    }

    public Node recursiveReverse() {
        this.head = this.recursiveReverse(head);
        return this.head;
    }
    
    private Node recursiveReverse(Node node) {
        // If empty list, return  
        if (node == null) {
            return null;
        }

        // Otherwise, swap the next and prev  
        Node temp = node.next;
        node.next = node.prev;
        node.prev = temp;

        
        if (node.prev == null) {
            return node;
        }

        // Otherwise, keep going  
        return recursiveReverse(node.prev);
    }

}
