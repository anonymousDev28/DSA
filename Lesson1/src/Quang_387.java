public class Quang_387 {
    public static void main(String[] args) {
        String test = "deetcode";
        System.out.println(firstUniqChar(test));
    }
    public static int firstUniqChar(String s) {
        int[] store_unicodes = new int[125];
        int len = s.length();
        // duyệt s để đếm tần số của mỗi kí tự
        for (int i = 0; i < len; i++) {
            // ép kiểu từ char sang int để lấy mã ASCII
            int index = (int)s.charAt(i);
            // tăng giá trị của phần tử có index = mã ASCII của kí tự thứ i
            store_unicodes[index]++;
        }
        // duyệt s để tìm kí tự đầu tiên trong chuỗi có tần số == 1
        for (int i = 0; i < len; i++) {
            // ép kiểu từ char sang int để lấy mã ASCII
            int index = (int)s.charAt(i);
            // trả về kí tự đầu tiên trong chuỗi có tần số == 1
            if(store_unicodes[index] == 1)
                return i;
        }
        // nếu không có kí tự nào thỏa mãn thì trả về -1
        return -1;
    }
}
