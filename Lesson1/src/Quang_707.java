
public class Quang_707 {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        System.out.println("add at Head value = 1 ");
        obj.printNodes();
        obj.addAtTail(3);
        System.out.println("add at Tail value = 3 ");
        obj.printNodes();
        obj.addAtIndex(1, 2);
        System.out.println("add at index = 1 value = 2 ");
        obj.printNodes();
        System.out.println("get index = 1: " + obj.get(1));
        obj.deleteAtIndex(1);
        System.out.println("delete at index = 1");
        obj.printNodes();
        System.out.println("get index = 1: " + obj.get(1));
    }

    static class MyLinkedList {
        Node head;
        int length;

        public static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        public MyLinkedList() {
            this.head = null;
            this.length = 0;
        }

        public int get(int index) {
            Node node = head;
            int count = 0;
            while (node != null) {
                if (count == index) {
                    return node.val;
                }
                count++;
                node = node.next;
            }
            return -1;
        }

        public void addAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            length++;
        }

        public void addAtTail(int val) {
            if (head == null) {
                addAtHead(val);
            } else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = new Node(val);
                length++;
            }
        }

        public void addAtIndex(int index, int val) {
            if (index > length)
                return;
            if (index == 0)
                addAtHead(val);
            else {
                int count = 1;
                Node temp = head;
                while (count < index) {
                    temp = temp.next;
                    count++;
                }
                Node newNode = new Node(val);
                Node next = temp.next;
                newNode.next = next;
                temp.next = newNode;
                length++;
            }
        }

        public void deleteAtIndex(int index) {
            if (index >= length)
                return;
            if (index == 0) {
                head = head.next;
                length--;
            } else {
                int count = 1;
                Node temp = head;
                while (count < index) {
                    count++;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                length--;
            }
        }

        public void printNodes() {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.val + "->");
                tmp = tmp.next;
            }
        }
    }
}
