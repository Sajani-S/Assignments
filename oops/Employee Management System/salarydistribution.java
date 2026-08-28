public class salarydistribution {

    public static void main(String[] args){


        FullTimeEmployee h = new FullTimeEmployee("hari",4,45000);
        PartTimeEmployee k = new PartTimeEmployee("vishnu", 7, 3, 5000);

        EmployeeManagement n = new EmployeeManagement();

        n.employeeadded(h);
        n.employeeadded(k);

    }
}
