package star.inc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import star.inc.dao.BookDao;
import star.inc.model.Book;

import javax.sql.DataSource;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class MyAppContextConfig {

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/bean_book");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root123");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        DataSource dataSource = driverManagerDataSource();
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public BookDao bookDao(){
        return new BookDao();
    }

}
