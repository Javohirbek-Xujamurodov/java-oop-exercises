package lesson2.ex_4;

public class testEmployee {
    public static void main(String[] args) {
        Employee empl = new Employee( 875 , " John" , 1000000);

        System.out.println("Id : " + empl.getId());
        System.out.println("Name : " + empl.getName());
        System.out.println("Salary : " + empl.getSalary());

        empl.raiseSalary(10);

        System.out.println("New Salary after 10% raise: $" +empl.getSalary() );
    }
}
