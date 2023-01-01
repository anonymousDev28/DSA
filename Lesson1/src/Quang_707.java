
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

    public static class MyLinkedList {
        static class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
            }
        }

        public Node head;

        public MyLinkedList() {

        }

        // ok
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

        // ok
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

        // ok
        public void addAtTail(int val) {
            Node node = head;
            Node newNode = new Node(val);
            int size = getSize(head);
            if (size == 0) {
                addAtHead(val);
                return;
            }
            while (node != null) {
                if (node.next == null) {
                    node.next = newNode;
                    return;
                }
                node = node.next;
            }
        }

        public int getSize(Node head) {
            int count = 0;
            Node tmp = head;
            while (tmp != null) {
                count++;
                tmp = tmp.next;
            }
            return count;
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            } else {
                int count = 0;
                Node node = head;
                Node newNode = new Node(val);
                while (count < index) {
                    if (count == index - 1) {
                        newNode.next = node.next;
                        node.next = newNode;
                        return;
                    }
                    count++;
                    node = node.next;
                }
                if (count == index) {
                    addAtTail(val);
                }
            }
        }

        public void deleteAtTail() {
            int size = getSize(head);
            Node node = head;
            // xac dinh prev cua tail
            int count = 0;
            while (count != size - 1) {
                count++;
                node = node.next;
            }
            // node dang la prev tail
            node.next = null;
        }

        public void deleteAtIndex(int index) {
            int count = 0;
            Node node = head;
            int size = getSize(head);
            if (index == 0) {
                //delete at head
                head = head.next;
            } else if (index == size) {
                deleteAtTail();
            } else {
                while (node != null) {
                    if (count == index - 1) {
                        node.next = node.next.next;
                    }
                    count++;
                    node = node.next;
                }
            }
        }

        public void printNodes() {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.val + "->");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }
}
