package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Quang_2073 {
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{2, 3, 2}, 2));
    }
    // time complexity: O(n)
    // space comlexity: O(n)
    public static int timeRequiredToBuy(int[] tickets, int k) {
        // đánh dấu số vé của người mà đề bài yêu cầu
        tickets[k] *= -1;
        // deque dùng arrayDeque
        Deque<Integer> queue = new ArrayDeque<>();
        for (int n : tickets) {
            if (n != 0) queue.offerLast(n);
        }
        // result
        int timeRequired = 0;

        while (!queue.isEmpty()) {
            // get first gán vào ticket
            int ticket = queue.pollFirst();
            // kiểm tra ticket có phải target hay không (ticket < 0)
            boolean isTarget = ticket < 0;
            // nếu ticket là target thì tăng 1 để tiến về 0
            if (isTarget) ticket += 1;
                // không là target thì giảm 1 cũng để tiến về 0
            else ticket -= 1;
            // tăng result
            ++timeRequired;
            // nếu ticket hiện tại là target và đã đếm đủ thì thoát vòng lặp
            if (ticket == 0 && isTarget) break;
            // ticket != 0 thì thêm vào cuối queue để tiếp tục đếm
            if (ticket != 0) queue.offerLast(ticket);
        }
        // trả về result
        return timeRequired;
    }
}
