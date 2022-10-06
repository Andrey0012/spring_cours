package hibernate_one_to_one;


import hibernate_one_to_one.entity.Details;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class).
                buildSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Andrey", "Kalinin", "IT", 250);
//            Details details = new Details("NNovgorod", "9210456354", "andrey.0012@mail.ru");
//            Employee employee = new Employee("Ivan", "Smirnov", "Sales", 200);
//            Details details = new Details("Kirov", "12345", "ivan.0012@mail.ru");
      //      employee.setEmpDetails(details);
     //       details.setEmployee(employee);
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
            Details details = session.get(Details.class,3);
            details.getEmployee().setEmpDetails(null);
            session.delete(details);
//            session.delete(employee);
      //      session.save(details);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }



    }
}
