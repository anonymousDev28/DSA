public class Quang_206 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        printNodes(reverseList(n1));
    }

    public static void printNodes(ListNode head) {
        while (head != null) {
            System.out.println(head.val + "->");
            head = head.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //    time complexity: O( m + n )
    //    space complexity: O(n)
    public static ListNode reverseList(ListNode head) {
        ListNode tmp = head;
        ListNode result = new ListNode();
        if (head == null || head.next == null) {
            return head;
        }
        while (tmp != null) {
            if (tmp == head) {
                result.val = tmp.val;
                tmp = tmp.next;
            }
            ListNode newNode = new ListNode(tmp.val);
            newNode.next = result;
            result = newNode;
            tmp = tmp.next;
        }
        return result;
    }
}
