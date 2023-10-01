import java.util.Scanner;
import java.util.LinkedList;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int number = sc.nextInt();
        LinkedList<Integer> obj = new LinkedList<Integer>();
        while(number>0){
            obj.add(sc.nextInt());
            number--;
        }
        for (int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i)+"->");
        }
        System.out.println("NULL");

        for (int i = 0; i < obj.size(); i++) {
            if(obj.get(i) > 25){
                obj.remove(i);
            }
        }
        System.out.println("After deleting number Greater than 25");
        for (int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i)+"->");
        }
        System.out.println("NULL");
    }
    
}
