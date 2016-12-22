package repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.MemberMapper;
import vo.Member;

@Component
public class MemberDao {
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public Member select(String id){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
			return mapper.selectMember(id);
		
	}

}
