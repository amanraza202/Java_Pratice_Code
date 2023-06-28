public class sumOfProductArray {
    public static void main(String[] args) {
        int arr1[] = { 22, 7, 1, -5, 5, -2 };
        int arr2[] = { 4, -1, 21, 12, 10, -3};
        int n = arr1.length;
        int m = arr2.length;
        int product = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            product = arr1[i] * arr2[n-i-1];
            sum += product;

        }
        System.out.println(sum);
    }
}
