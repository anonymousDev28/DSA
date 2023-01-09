import java.util.*;

public class Quang_387 {
    public static void main(String[] args) {
        String test = "leetcode";
        System.out.println(firstUniqChar(test));
    }
    // time complexity: O(n)
    // space complexity: O(n)
    public static int firstUniqChar(String s) {
        // tạo mảng lưu tần xuất của các char
        int[] charOccurrences = new int[26];
        //char -> first index pairs
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //tính tần số của k tự
            charOccurrences[c - 'a']++;
            // lưu key = char và value = index lần đầu tiên của char trong s
            if (map.keySet().size() < 26) {
                if (!map.containsKey(c)) {
                    map.put(c, i);
                }
            }
        }
        int min = s.length();
        //duyệt hashmap để tìm kí tự có tần số = 1 và index nhỏ nhất
        for (char c : map.keySet()) {
            if (charOccurrences[c - 'a'] == 1) {
                int idx = map.get(c);
                if (min > idx) min = idx;
            }
        }
        return min == s.length() ? -1 : min;
    }
    // time complexity: O(n)
    // space complexity: O(n)
    public static int firstUniqChar2(String s) {
        int[] store_unicodes = new int[125];
        int len = s.length();
        // duyệt s để đếm tần số của mỗi kí tự
        for (int i = 0; i < len; i++) {
            // ép kiểu từ char sang int để lấy mã ASCII
            int index = s.charAt(i);
            // tăng giá trị của phần tử có index = mã ASCII của kí tự thứ i
            store_unicodes[index]++;
        }
        // duyệt s để tìm kí tự đầu tiên trong chuỗi có tần số == 1
        for (int i = 0; i < len; i++) {
            // ép kiểu từ char sang int để lấy mã ASCII
            int index = s.charAt(i);
            // trả về kí tự đầu tiên trong chuỗi có tần số == 1
            if(store_unicodes[index] == 1)
                return i;
        }
        // nếu không có kí tự nào thỏa mãn thì trả về -1
        return -1;
    }

}
