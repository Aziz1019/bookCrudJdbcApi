package star.inc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import star.inc.model.Book;

import java.util.List;
import java.util.Map;

public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveBook(Book book){
        String query = "insert into bbook(author, book_name) values(?, ?)";
        return jdbcTemplate.update(query, book.getAuthor(), book.getBook_name());
    }

    public List<Map<String, Object>> bookList(){
        return jdbcTemplate.queryForList("select * from bbook");
    }

    public int update(Book book){
        String query = "update bbook set author = ?, book_name = ? where id = ?";
        return jdbcTemplate.update(query, book.getAuthor(), book.getBook_name(), book.getId());
    }

    public int delete(int id){
        String query = "delete from bbook where id = " + id;
        return jdbcTemplate.update(query);
    }


}
