import java.util.ArrayList;

class student {
    String name;
    int age;
    int roll;

    student(String n, int a, int rno) {
        name = n;
        age = a;
        roll = rno;
    }
}

public class user_define_class_objects_in_ArrayList {
    public static void main(String[] args) {
        student s1 = new student("Aman", 21, 10);
        student s2 = new student("Shahid", 20, 32);
        student s3 = new student("Saddam", 22, 33);

        // creating ArrayList
        ArrayList<student> stu = new ArrayList<student>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        System.out.println("Name  Age  Rollno");
        for(student f :stu){
            System.out.println(f.name+"   "+f.age+"    "+f.roll);
        }

    }
}
