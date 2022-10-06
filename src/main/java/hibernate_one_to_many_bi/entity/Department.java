package hibernate_one_to_many_bi.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String nameDepartments;
    @Column (name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int min_salary;

    @OneToMany (cascade = CascadeType.ALL,
            mappedBy = "department",
            fetch = FetchType.LAZY)
    private List<Employee> employees;

    public void addEmployeeToDepartment (Employee employee1) {
        if (employees == null) {
            employees =new ArrayList<>();
        }
        employees.add(employee1);
        employee1.setDepartment(this);
    }

    public Department() {
    }

    public Department(String nameDepartments, int maxSalary, int min_salary) {
        this.nameDepartments = nameDepartments;
        this.maxSalary = maxSalary;
        this.min_salary = min_salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartments='" + nameDepartments + '\'' +
                ", maxSalary=" + maxSalary +
                ", min_salary=" + min_salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDepartments() {
        return nameDepartments;
    }

    public void setNameDepartments(String nameDepartments) {
        this.nameDepartments = nameDepartments;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
