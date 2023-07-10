// package JavaExercise1;

import java.util.Scanner;

public class Allquestion {
    public static void printAvg(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println("Average of three number is: "+avg);
    }


    // Question 2
    public static void sumOfOdd(int n){
        int sumofodd =0;
        for(int i =1; i<=n; i++){
            if(i%2!=0){
                sumofodd += i;
            }
        }
        System.out.println(sumofodd);
    }


    // Question 3
    public static void greatestNumber(int a , int b){
        if(a>b){
            System.out.println("a is greater "+a);
        }
        else{
            System.out.println("b is greater "+b);
        }
    }

    // Question 4
    // public static double circumferenceOfRadius(double r){
    //     double cir = 2 * 3.14 * r;
    //     return cir;
    // }


    // Question 8
    // public static void powerOfNumber(Double x, Double n){
    //     double pow = Math.pow(x, n);
    //     System.out.println(pow);

    // }

    // Question 10
    public static void fibonacci(int n){
        int sum =0;
        int n1 =0;
        int n2 =1;
        System.out.print(n1 +" "+n2+" ");
        for(int i =2; i<=n; i++){
            sum = n1+n2;
            System.out.print(sum+" ");
            n1= n2; 
            n2 = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // printAvg(a, b, c);
        
        // Question 2
        // int n = sc.nextInt();
        // sumOfOdd(n);


        // Question 3
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // greatestNumber(a, b);

        // Question 4
        // double r = sc.nextDouble();
        // double circumference = circumferenceOfRadius(r);
        // System.out.println(circumference);


        // Question 8
        // double x = sc.nextInt();
        // double n = sc.nextInt();
        // powerOfNumber(x, n);

        // Question 10
        fibonacci(10);
    }
}
