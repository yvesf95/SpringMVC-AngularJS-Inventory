package sample.dao;

import sample.model.Employee;

import java.util.List;

/**
 * Created by Yves on 12/22/2016.
 */
public interface EmployeeDao {
    List<Employee> listAllEmployees();
    Employee getEmployeeById(int id);
    Employee getEmployeeBySsn(String ssn);
    void addEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
