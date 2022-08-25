package star.inc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import star.inc.config.MyAppContextConfig;
import star.inc.dao.BookDao;
import star.inc.model.Book;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppContextConfig.class);
        BookDao bookDao = context.getBean("bookDao", BookDao.class);

        Book book = new Book("Jojo Moyes", "After You");
        int book1 = bookDao.saveBook(book);
        bookDao.update(2, new Book("Jojo", "After"));
        bookDao.delete(1);
        List<Map<String, Object>> maps = bookDao.bookList();
        System.out.println(maps);





    }
}
