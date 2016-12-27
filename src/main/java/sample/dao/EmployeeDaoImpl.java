package sample.dao;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import sample.model.Employee;

import java.util.List;

/**
 * Created by Yves on 12/22/2016.
 */
@Repository
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {

    protected EmployeeDaoImpl() {
        super(Employee.class);
    }

    public List<Employee> listAllEmployees() {
        return listAll();
    }

    public Employee getEmployeeById(int id) {
        return getById(id);
    }

    public Employee getEmployeeBySsn(String ssn) {
        return null;
    }

    public void addEmployee(Employee employee) {
        persist(employee);
    }

    public void deleteEmployee(Employee employee) {
        delete(employee);
    }
}
