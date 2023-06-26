/**
 * subarraySum
 */
public class subarraySum {

    public static void main(String[] args) {
        int N = 5;
        int S = 12;

        int A[] = { 1, 2, 3, 7, 5 };
        for (int i = 0; i < N; i++) {
            for(int j = i+1;j<N; j++){
                for(int z = i; z<j; z++){
                    if(A[i] +A[z] == S){
                        System.out.println(i+""+z);
                    }
                }

            }
            
        }
    }
}