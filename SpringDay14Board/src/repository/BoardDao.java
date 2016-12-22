package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import repository.mapper.BoardMapper;
import vo.Article;

@Component
public class BoardDao {
	
	private SqlSessionTemplate session;
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insert(Article article){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.insert(article);
	}
	
	public Article select(int articleNum){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.select(articleNum);
		
	}
	
	
	
}
