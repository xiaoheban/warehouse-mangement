import com.funeasy.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = (BookServiceImpl) applicationContext.getBean("bookService");
        bookService.save();
    }
}
