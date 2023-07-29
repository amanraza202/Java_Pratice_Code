public class swapNumber {
    public static void swap(int a, int b){
        System.out.println("Before Swap "+a+" "+b);
        int temp;
        temp = a;
        a= b;
        b = temp;
        System.out.println("After Swap " +a+" "+b);
    }

    public static void swapSumDifference(int a, int b){
        System.out.println("Before Swap "+a+" "+b);
        a= a+b;
        b = a-b;
        a= a-b;
        System.out.println("After Swap "+a+" "+b);

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // swap(a, b);
        swapSumDifference(a, b);
    }
}
