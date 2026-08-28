public class FullTimeEmployee extends Employee {

    double fixedsalary;

    public FullTimeEmployee(String name, int id, double salary) {

        super(name, id);

        this.fixedsalary = salary;

    }


    public double calculatesalary() {

        return fixedsalary;
    }


}