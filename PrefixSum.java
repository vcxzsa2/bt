package buoi6;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];  // Bắt đầu với phần tử đầu tiên của arr

        // Tính prefix sum cho các phần tử tiếp theo
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // In ra dãy prefix sum
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }
}
