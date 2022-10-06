package hibernate_many_to_many;




import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).
                buildSessionFactory();
        Session session = null;
        try {
//            session=factory.getCurrentSession();
//            Section section = new Section("Futbol");
//            Child child = new Child("Andreu", 5);
//            Child child1 = new Child("Ivan", 6);
//            Child child2 = new Child("Maria", 7);
//            section.addSectionToChild(child);
//            section.addSectionToChild(child1);
//            section.addSectionToChild(child2);
//            session.beginTransaction();
//            session.save(section);
//            session.getTransaction().commit();


//            session=factory.getCurrentSession();
//            Section section = new Section("Volleyball");
//            Section section1 = new Section("Math");
//            Section section2 = new Section("Tennis");
//            Child child = new Child("Macsim", 10);
//
//            child.addChildToSections(section);
//            child.addChildToSections(section1);
//            child.addChildToSections(section2);
//            session.beginTransaction();
//            session.save(child);
//            session.getTransaction().commit();

//            session=factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            session.getTransaction().commit();
//
//            session=factory.getCurrentSession();
//            Section section = new Section("Dance");
//            Child child = new Child("Igor", 5);
//            Child child1 = new Child("Alena", 6);
//            Child child2 = new Child("Vasilii", 7);
//            section.addSectionToChild(child);
//            section.addSectionToChild(child1);
//            section.addSectionToChild(child2);
//            session.beginTransaction();
//            session.persist(section);
//            session.getTransaction().commit();


            session=factory.getCurrentSession();
            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
            Child child = session.get(Child.class, 1);
            session.delete(child);
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }



    }
}
