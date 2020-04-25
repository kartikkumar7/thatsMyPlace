package Business.Employee;

import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author bboysticker
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setId(employeeList.size());
        employeeList.add(employee);
        return employee;
    }
    
    public Student createStudent(String name, String email) {
        Student student = new Student(email);
        student.setName(name);
        student.setId(employeeList.size()+1);
        employeeList.add(student);
        return student;
    }
}
