public class Quang_203 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printNodes(removeElements(n1,2));
    }

    public static void printNodes(ListNode head) {
        ListNode node = head;
        while (node != null) {
            if (node.next != null) {
                System.out.print(node.val + "->");
            } else {
                System.out.print(node.val);
            }
            node = node.next;
        }
        System.out.println();
    }
    //  time complexity: O(n)
    //  space complexity: O(1)
    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode preNode = null;
        while (node != null) {
            if(node == head && node.val == val){
                head = node.next;
            }else if(node.val == val){
                preNode.next = node.next;
            }
            preNode = node;
            node = node.next;
        }
        return head;
    }



}
