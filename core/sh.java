
public class sh{
    public static void rainwater(int arr[]) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        // Calculate maximum height from the left
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // Calculate maximum height from the right
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        // Compute trapped rainwater
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println("Trapped rainwater: " + ans);
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 0, 1, 2};
        rainwater(arr);
    }
}

