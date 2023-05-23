package hus.oop.MidtermExam.Exercise1.inheritance;

public class Programmer extends Employee {
    private int bonus;

    public Programmer() {
    }

    public Programmer(int bonus) {
        super(150.0);
        this.bonus = bonus;
    }

    public Programmer(double salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Programmer[bonus = " + bonus + ", salary = " + salary + "]";
    }
}
