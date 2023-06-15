public class divisibleByn {
    public static boolean divisible(int n, int num1, int num2) {
        if(n% num1 == 0 && n%num2 ==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 8;
        int num1 = 3;
        int num2 = -4;
        boolean res = divisible(n, num1, num2);
        System.out.println(res);
    }
}
