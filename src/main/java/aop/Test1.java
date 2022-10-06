package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1  {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibraryBean", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        library.getBook();
          library.addBook("Andrey",book);
        System.out.println();

//        library.addMagazine();
     //   library.returnMagazine();
       // library.addBook();
//        SchoolLibrary library1 = context.getBean("schoolLibrary", SchoolLibrary.class);
//        library1.getBook();

        context.close();

    }
}
