package tuf.Recursion;


public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        reverse(arr, arr.length);
        System.out.println("\nReversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr, int n) {
        reverseHelper(arr, 0, n - 1);
    }

    private static void reverseHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseHelper(arr, left + 1, right - 1);
    }
}
