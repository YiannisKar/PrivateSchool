
// A class responsible for keeping track of the Students entity;

public class Student {

    private String name;
    private String surname;
    private int Id;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    public Student(String name, String surname, int id, int grade) {
        this.name = name;
        this.surname = surname;
        Id = id;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return Id;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees){

        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFess(){

        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name is: " + name + ". Total fees paid so far $" +feesPaid;
    }
}
