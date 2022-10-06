package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("book")
public class Book {
    @Value("Преступлнеи и наказание")
    private String name;

    @Value("Достоевский")
    private String author;

    @Value("1866")
    private int yearOfPublication;

    public String getName() {return name;}

    public String getAuthor() {return author;}

    public int getYearOfPublication() {return yearOfPublication;}

}
