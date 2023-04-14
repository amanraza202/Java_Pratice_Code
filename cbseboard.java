import java.util.*;

public class cbseboard{

    public static void main(String[] args) {
        float perc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks in Math:");
        float Math = sc.nextFloat();
        System.out.print("Enter your Marks in English:");
        float English = sc.nextFloat();
        System.out.print("Enter your Marks in Science:");
        float Science = sc.nextFloat();
        System.out.print("Enter your Marks in History:");
        float History = sc.nextFloat();
        System.out.print("Enter your Marks in Computer:");
        float Computer = sc.nextFloat();
        perc = (float) (((Math + English + Science + History + Computer) / 500)*100);
        System.out.print("Your Percentage is:" + perc);

    }
}