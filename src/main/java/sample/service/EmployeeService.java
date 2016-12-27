package sample.service;

import sample.model.Employee;

import java.util.List;

/**
 * Created by Yves on 12/22/2016.
 */
public interface EmployeeService {
    List<Employee> listAllEmployees();
    Employee getEmployeeById(int id);
    Employee getEmployeeBySsn(String ssn);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    boolean isEmployeeSsnUnique(String ssn);

}
