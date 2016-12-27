package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sample.model.Employee;
import sample.service.EmployeeService;

import java.util.Date;
import java.util.List;

/**
 * Created by Yves on 12/21/2016.
 */

@Controller
//@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

/*
    @RequestMapping(value = {"/html/"}, method = RequestMethod.GET)
    public String indexHtml(){
        return "";
    }

    @RequestMapping(value = {"/html/home"}, method = RequestMethod.GET)
    public String homeHtml(){
        return "html/home.html";
    }
*/

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String indexJsp(){
        return "index.jsp";
    }

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String homeJsp(ModelMap model){
        List<Employee> employees = employeeService.listAllEmployees();
        model.addAttribute("employees", employees);
        return "home.jsp";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String listEmployee(ModelMap model){
        List<Employee> employees = employeeService.listAllEmployees();
        model.addAttribute("employees", employees);
        return "employees.jsp";
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public String getEmployeeUsingId(@PathVariable("id") int id, ModelMap model){
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-details.jsp";
    }

    @RequestMapping(value = "/add-employee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") Employee employee, BindingResult result){
        if(result.hasErrors()){
            return "add-employee.jsp";
        } else {
            employee.setDateJoined(new Date());
            employeeService.addEmployee(employee);
            return "success.jsp";
        }
    }

    @RequestMapping(value = "/edit-employee/{id}", method = RequestMethod.GET)
    public String editEmployee(@PathVariable("id") int id, ModelMap model){
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "edit-employee.jsp";
    }

    @RequestMapping(value = "/update-employee/", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute("employee") Employee employee, BindingResult result){
        if (result.hasErrors()){
            return "edit-employee.jsp";
        } else {
            employeeService.updateEmployee(employee);
            return "success.jsp";
        }
    }

    @RequestMapping(value = "/delete-employee/{id}", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable("id") int id, ModelMap model){
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null){
            model.addAttribute("msg", "Not Found.");
            return "fail.jsp";
        } else {
            employeeService.deleteEmployee(employee);
            return "redirect:/employees";
        }
    }
}
