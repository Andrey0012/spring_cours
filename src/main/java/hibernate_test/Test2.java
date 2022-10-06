package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidorof", "Sales", 250);
            session.beginTransaction();
            session.save(employee);
          //  session.getTransaction().commit();
           // System.out.println("Done");
            int myId = employee.getId();
           // Session session = sessionFactory.getCurrentSession();
          //  session.beginTransaction();
            Employee employee1 = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee1);
        } finally {
            sessionFactory.close();
        }



    }
}
