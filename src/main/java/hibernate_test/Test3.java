package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
           // List <Employee> list = session.createQuery("from Employee").getResultList();
            List <Employee> list = session.createQuery("from Employee where name = 'Andrey' AND salary>250").getResultList();
            for (Employee e : list) System.out.println(e);

            session.getTransaction().commit();
            System.out.println("Dane");
        } finally {
            sessionFactory.close();
        }



    }
}
