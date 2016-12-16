package test01_spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class BookDao{
	@Autowired
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	private BookMapper mapper = new BookMapper();
	
	public BookDao(){}
	
	public BookDao(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
//	public int insert(BookVO book){
//		String sql = "insert into book(title,publisher,writer,price) values(?,?,?,?)";
//		return JdbcTemplate.update(sql, book.getTitle(), book.getPublisher(), book.getWriter(), book.getPrice());
//	}
//	
//	public int delete(int bookNum){
//		String sql = "delete from book where book_num=? and title=?";
//		return JdbcTemplate.
//	}
//	
	
	class BookMapper implements RowMapper<BookVO>
	
}