package FinalExam;

import java.util.HashMap;

public class Quang_1748 {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 2}));
    }
    // time comlexity: O(n)
    // space complexity: O(1)
    // tạo mảng lưu tần số xuất hiện của từng phần tử trong mảng input
    // và tính tổng các số chỉ xuất hiện 1 lần
    public static int sumOfUnique(int[] nums) {
        // tạo mảng lưu tần số xuất hiện
        int freq[] = new int[101];
        // duyệt mảng nums lưu tần số của các phần tử xuất hiện trong mảng
        for (int i = 0; i < nums.length; i++)
            freq[nums[i]]++;
        int sum = 0;
        // tính tổng các số chỉ xuất hiện 1 lần
        for (int i = 1; i < 101; i++) {
            if (freq[i] == 1)
                sum += i;
        }
        return sum;
    }
}

