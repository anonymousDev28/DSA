public class Quang_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(4));
        System.out.println(getSumOfSquares(2));
    }
    // lấy tổng của các bình phương
    public static int getSumOfSquares(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        // lý do em hardcode chọn số 4 là vì nếu getSumOfSquares(2) thì nó sẽ rơi vào vòng lặp vô hạn {4, 16, 37, 58, 89, 145, 42, 20}
        while (n != 1 && n != 4) {
            n = getSumOfSquares(n);
        }
        return n == 1;
    }
}
