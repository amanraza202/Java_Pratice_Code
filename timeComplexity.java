
public class timeComplexity {
    public static void printItem(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // Time complexity O(n)
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
        // Time complexity O(n)
    }

    public static void printItem2(int n) {
        for (int i = 0; i < n; i++) { // ---> O(n)
            for (int j = 0; j < n; j++) { // --->O(n)
                System.out.println(i + " " + j); // --->O(n*n)
            }
        }
        // Time complexity O(n^2)
    }

    public static void printItem3(int n) {
        for (int i = 0; i < n; i++) { // ---> O(n)
            for (int j = 0; j < n; j++) { // --->O(n)
                System.out.println(i + " " + j); // --->O(n*n)
            }
        }
        for (int j = 0; j < n; j++) {// --->O(n)
            System.out.println(j);
        }
        // Time complexity O(n^2 + n)
        // n^2 is domintant so we Drop n
        // time Complexity O(n^2)
    }

    public static int printItem4(int n) {
        return n+n; // Time complexity O(1)
    }
     public static void printItem5(int a ,int b) {
        for (int i = 0; i < a; i++) { // ---> O(a)
            
        }
        for (int j = 0; j < b; j++) {// --->O(b)
            System.out.println(j);
        }
        // Time complexity O(a + b)
        
    }
    public static void main(String[] args) {
        int n = 10;
        printItem(n); // Time complexity is O(2n) ---> O(n) [Drop all the constant]
        printItem2(n); // Time complexity is O(n^2)
        printItem3(n); // Time complexity is O(n^2)
        // printIte m4(n); // Time complexity is O(1)
        // printItem5(a,b); // Time complexity is O(a+b)

    }

}