public class Teacher {

    private String name;
    private String surname;
    private int id;
    private int salary;
    private  int salaryEarned;

    public Teacher(String name, String surname, int id, int salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){

        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);


    }


}
