import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            Teacher Jack = new Teacher("Jack","Jonathan",1,  20000);
            Teacher Nick = new Teacher("Nick","Danielson",2,  25000);
            Teacher Michael= new Teacher("Michael","Nelson",3,  30000);

            List<Teacher> teacherList = new ArrayList<>();
            teacherList.add(Jack);
            teacherList.add(Nick);
            teacherList.add(Michael);




            Student Eric = new Student("Eric","Cartman",1,5);
            Student Chuck = new Student("Chuck", "Jason",2,4);
            Student Corey = new Student("Corey","Taylor",3,5);

            List<Student> studentList = new ArrayList<>();

                studentList.add(Eric);
                studentList.add(Chuck);
                studentList.add(Corey);

            School Dod = new School(teacherList,studentList);

        Eric.payFees(30000);
        System.out.println("The Dod has totally earned $" + Dod.getTotalMoneyEarned());

        Jack.receiveSalary(Jack.getSalary());
        System.out.println("Dod has spent to salary "+ Jack.getName()+ " and now has " + Dod.getTotalMoneyEarned());

        System.out.println(Eric);

    }
}
