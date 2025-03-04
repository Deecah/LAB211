package week5.LargeNumber;

public class Number {
    private String value;

    public Number(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Number addTwoNumber(Number other) {
        return new Number(addLargeNumber(this.value, other.value));
    }

    public String addLargeNumber(String so1, String so2) {
        StringBuilder result = new StringBuilder();
        int sodu = 0;

        int len1 = so1.length();
        int len2 = so2.length();
        int i = len1 - 1, j = len2 - 1;

        while (i >= 0 || j >= 0 || sodu > 0) {
            int s1 = 0;
            if (i >= 0) {
                s1 = so1.charAt(i) - '0';
                i--;
            }

            int s2 = 0;
            if (j >= 0) {
                s2 = so2.charAt(j) - '0';
                j--;
            }

            int sum = s1 + s2 + sodu;
            result.append(sum % 10);
            sodu = sum / 10;
        }

        return result.reverse().toString();
    }

    public String multiplyLargeNumber(String so1, String so2) {
        int len1 = so1.length();
        int len2 = so2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            int n1 = so1.charAt(i) - '0';
            int carry = 0;

            for (int j = len2 - 1; j >= 0; j--) {
                int n2 = so2.charAt(j) - '0';
                int sum = n1 * n2 + result[i + j + 1] + carry;
                result[i + j + 1] = sum % 10;
                carry = sum / 10;
            }

            result[i] += carry;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public Number multiplyTwoNumber(Number other) {
        return new Number(multiplyLargeNumber(this.value, other.value));
    }
}
