package sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sample.dao.EmployeeDao;
import sample.model.Employee;

import java.util.List;

/**
 * Created by Yves on 12/22/2016.
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> listAllEmployees() {
        return employeeDao.listAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    public Employee getEmployeeBySsn(String ssn) {
        return employeeDao.getEmployeeBySsn(ssn);
    }

    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public void updateEmployee(Employee employee){
        Employee entity = getEmployeeById(employee.getId());
        if (employee != null){
            entity.setName(employee.getName());
            entity.setDateJoined(employee.getDateJoined());
            entity.setSalary(employee.getSalary());
            employee.setSsn(employee.getSsn());
        }
    }

    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }

    public boolean isEmployeeSsnUnique(String ssn) {
        return false;
    }
}
