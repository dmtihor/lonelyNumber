public class LonelyNumber {
    public static int find(int[] input) {

        int[] sum = new int[32];

        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            for (int j = 0; j < 32; j++) {
                int mask = 1 << j;
                if ((num & mask) != 0) {
                    sum[j] += 1;
                }
            }
        }

        int res = 0;

        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res += sum[31 - i] % 5;
        }
        return res;
    }
}