package hibernate_one_to_many_bi;




import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).
                buildSessionFactory();
        Session session = null;
        try {
//            session = sessionFactory.getCurrentSession();
//            Department department = new Department("Sales", 2200,500);
//            Employee employee = new Employee("Andrey","Kalinin", 500);
//            Employee employee1 = new Employee("Ivan", "Smirnov", 2200);
//            Employee employee2 = new Employee("Anton", "Sidorov", 1500);
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");


            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class,6);
            System.out.println(department);
            System.out.println(department.getEmployees());
            session.getTransaction().commit();
            System.out.println("Done!!");


//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,8);
//            System.out.println(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!!");

//
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,8);
//            Department department = session.get(Department.class, 4);
//            session.delete(department);
//            session.getTransaction().commit();
//            System.out.println("Done!!");
        } finally {
            session.close();
            sessionFactory.close();
        }



    }
}
