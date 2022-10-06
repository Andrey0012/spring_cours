package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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
//            Department department = new Department("IT", 1200,300);
//            Employee employee = new Employee("Andrey","Kalinin", 400);
//            Employee employee1 = new Employee("Ivan", "Smirnov", 700);
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");


            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Employee employee = session.get(Employee.class,6);
            session.delete(employee);

            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }



    }
}
