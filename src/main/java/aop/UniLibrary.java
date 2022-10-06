package aop;

import org.springframework.stereotype.Component;

@Component ("uniLibraryBean")
public class UniLibrary{


    public void getBook () {
        System.out.println("Мы взяли книгу из UniLibrary");
        System.out.println("---------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Мы возвращаем книгу из UniLibrary");
        return  "Война и мир";
    }

    public void getMagazine () {

        System.out.println("Мы взяли журнал из UniLibrary");
        System.out.println("---------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал из UniLibrary");
        System.out.println("---------------------------------");
    }

    public void addBook (String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("---------------------------------");
    }

    public void addMagazine () {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("---------------------------------");
    }
}
