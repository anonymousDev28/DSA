public class Quang_394 {
    public static void main(String[] args) {
        String test = "10[leetcode]";
        System.out.println(decodeString(test));
    }

    public static String decodeString(String s) {
        // nếu chuỗi rỗng trả về ""
        if (s.length() == 0) return "";
        String result = "";
        // duyệt chuỗi s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit_begin = i;
                while (s.charAt(i) != '[') i++;
                int num = Integer.parseInt(s.substring(digit_begin, i));
                int count = 1;
                int str_begin = i + 1;
                i++;
                while (count != 0) {
                    if (s.charAt(i) == '[') count++;
                    else if (s.charAt(i) == ']') count--;
                    i++;
                }
                i--;
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
