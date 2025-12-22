public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    // Helper recursive function
    private static boolean isSorted(int[] a, int i) {
        // Base case: reached the end (or empty / single element)
        if (i >= a.length - 1) {
            return true;
        }

        // If current pair is out of order
        if (a[i] > a[i + 1]) {
            return false;
        }

        // Recursive step
        return isSorted(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        System.out.println(isSorted(a)); // true

        int[] b = {1, 3, 2};
        System.out.println(isSorted(b)); // false
    }
}
