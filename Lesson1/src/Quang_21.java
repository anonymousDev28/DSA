public class Quang_21 {
    // time complexity : O(n^2)
    // space complexity : O(n^2)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode r = new ListNode();
        ListNode temp = r;
        while (list1 != null && list2 != null) {
            // l1 va l1  con phan tu
            if (list1.val >= list2.val) {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            } else {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            }
        }
        // l1 het phan tu
        if (list1 == null) {
            temp.next = list2;
        }
        // l2 het phan tu
        else {
            temp.next = list1;
        }
        return r.next;
    }
}
