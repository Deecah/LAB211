package week5.LargeNumber;

import java.util.Scanner;

public class BigNumberOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lớn đầu tiên từ người dùng
        System.out.print("Enter first large number: ");
        String num1 = sc.nextLine();

        // Nhập số lớn thứ hai từ người dùng
        System.out.print("Enter second large number: ");
        String num2 = sc.nextLine();

        // Tính và in ra tổng của hai số lớn
        System.out.println("Sum: " + add(num1, num2));

        // Tính và in ra tích của hai số lớn
        System.out.println("Product: " + multiply(num1, num2));
    }

    // Hàm cộng hai số lớn biểu diễn dưới dạng chuỗi
    public static String add(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Duyệt từ cuối chuỗi lên đầu và cộng từng cặp chữ số
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = Character.getNumericValue(num1.charAt(i)); // Lấy chữ số của num1
                i--;
            }

            if (j >= 0) {
                digit2 = Character.getNumericValue(num2.charAt(j)); // Lấy chữ số của num2
                j--;
            }

            int sum = digit1 + digit2 + carry; // Tổng hai chữ số và số dư
            result.append(sum % 10); // Thêm phần đơn vị vào kết quả
            carry = sum / 10; // Tính số dư cho lần cộng kế tiếp
        }

        return result.reverse().toString(); // Đảo ngược kết quả và trả về
    }

    // Hàm nhân hai số lớn biểu diễn dưới dạng chuỗi
    public static String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()]; // Mảng lưu kết quả nhân

        // Duyệt ngược từng chữ số của num1 và num2 để nhân từng cặp chữ số
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = Character.getNumericValue(num1.charAt(i));
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit2 = Character.getNumericValue(num2.charAt(j));
                int mul = digit1 * digit2; // Nhân hai chữ số
                int sum = mul + result[i + j + 1]; // Cộng kết quả nhân vào vị trí tương ứng trong mảng
                result[i + j + 1] = sum % 10; // Lưu phần đơn vị
                result[i + j] += sum / 10; // Cộng dồn phần chục vào vị trí trước đó
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Bỏ qua số 0 ở đầu kết quả
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString(); // Trả về kết quả hoặc 0 nếu không có số nào
    }
}
