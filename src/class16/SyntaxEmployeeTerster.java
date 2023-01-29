package class16;

public class SyntaxEmployeeTerster {
    public static void main(String[] args) {

        SyntaxEmployee newEmployee1 = new SyntaxEmployee();
        newEmployee1.empID = 123456;
        newEmployee1.salary = 3456;

        SyntaxEmployee newEmployee2 = new SyntaxEmployee();
        newEmployee2.empID = 345641;
        newEmployee2.salary = 4511;

        System.out.println(newEmployee1.empID);
        System.out.println(newEmployee1.salary);
        System.out.println(SyntaxEmployee.ceo);


        System.out.println(newEmployee2.empID);
        System.out.println(newEmployee2.salary);
        System.out.println(SyntaxEmployee.ceo);

    }
}
