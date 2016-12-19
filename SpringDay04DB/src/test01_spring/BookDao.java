package test01_spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import test01_spring.vo.BookVO;

@Component("dao")
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private BookMapper mapper = new BookMapper();
	
	public BookDao(){}
	
	public BookDao(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(BookVO book){
		String sql = "insert into book(title,publisher,writer,price) values(?,?,?,?)";
		
		return jdbcTemplate.update(sql, book.getTitle(), book.getPublisher(), book.getWriter(), book.getPrice()); 
	}
	
	public int delete(int bookNum){
		String sql = "delete from book where book_num=? and title=?";
		return jdbcTemplate.update(sql, bookNum);
	}
	
	public BookVO select(int bookNum){
		String sql = "select * from book where book_num=?";
		return jdbcTemplate.queryForObject(sql, mapper, bookNum);
	}
	
	public List<BookVO> selectAll(){
		String sql = "select * from book";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public List<BookVO> selectByTitle(String title){
		String sql = "select * from book where title=?";
		return jdbcTemplate.query(sql, mapper,title);
	}
	
	class BookMapper implements RowMapper<BookVO>{

		@Override
		public BookVO mapRow(ResultSet rs, int arg1) throws SQLException {
			BookVO book = new BookVO();
			
			book.setBookNum(rs.getInt("book_num"));
			book.setTitle(rs.getString("title"));
			book.setPublisher(rs.getString("publisher"));
			book.setWriter(rs.getString("writer"));
			book.setPrice(rs.getInt("price"));
			return book;
		}
		
	}

}
