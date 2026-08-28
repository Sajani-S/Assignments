public class PartTimeEmployee extends Employee {

    double hour;
    double wages;


    public PartTimeEmployee(String name, int id, double hour ,  double rate) {

       super(name,id );
       this.hour = hour;
       this.wages = rate;

    }

    public double calculatesalary() {

       return hour * wages ;
    }










    }
