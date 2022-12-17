public class Quang_394 {
    public static void main(String[] args) {
        String test = "27[a2[c]]";
        System.out.println(decodeString(test));
    }

    public static String decodeString(String s) {
        // điều kiện dừng
        if (s.length() == 0) return "";
        String result = "";
        // duyệt chuỗi s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // tìm số đứng trước kí tự '['
            if (Character.isDigit(c)) {
                int digit_begin = i;
                // tăng i lên cho đến khi s.CharAt(i) == '['
                while (s.charAt(i) != '[') i++;
                int num = Integer.parseInt(s.substring(digit_begin, i));
                //đếm số kí tự trong []
                int count = 1;
                int str_begin = i + 1;
                i++;
                while (count != 0) {
                    if (s.charAt(i) == '[') count++;
                    else if (s.charAt(i) == ']') count--;
                    i++;
                }
                i--;
                // công thức quy nạp
                String str = decodeString(s.substring(str_begin, i));
                for (int j = 0; j < num; j++) {
                    result += str;
                }
            } else {
                result += c;
            }
        }
        return result;
    }

}
