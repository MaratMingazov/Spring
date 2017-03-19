
import org.library.LibraryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        LibraryService libraryService = (LibraryService) context.getBean("LibraryService");

        libraryService.addBook("Author1", "title1");
        libraryService.addBook("Author2", "title2");

        System.err.println(libraryService.getBooksList());
    }
}
