import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Fazle","Rabbi",123));
        employeeList.add(new Employee("Rashed","Hasan",135));
        employeeList.add(new Employee("Fazlerabbi","Rushu",223));
        employeeList.add(new Employee("Afrin","Jhan",323));
        employeeList.add(new Employee("Rahkunuzaman","Dipu",423));

        //employeeList.forEach(employee->System.out.println(employee));

        System.out.println(employeeList.get(0));
        System.out.println(employeeList.isEmpty());
        employeeList.set(0,new Employee("Fazle","Rabbi",333));
        employeeList.forEach(employee -> System.out.println(employee));


        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray){
            System.out.println(employee);
        }
        System.out.println("number of element is"+employeeList.size());
        System.out.println(employeeList.contains(new Employee("Fazle","Rabbi",333)));

       // employeeList.add(new Employee("sajib","shaikh",155));


    }
}