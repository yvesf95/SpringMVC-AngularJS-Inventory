package sample.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Yves on 12/21/2016.
 */
@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 30)
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_joined", nullable = false)
    private Date dateJoined;

    @Digits(integer = 8, fraction = 2)
    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "ssn", unique = true, nullable = false)
    private String ssn;

    public Employee() {
    }

    public Employee(String name, Date dateJoined, double salary, String ssn) {
        this.name = name;
        this.dateJoined = dateJoined;
        this.salary = salary;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateJoined=" + dateJoined +
                ", salary=" + salary +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
