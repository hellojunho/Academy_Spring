package models.member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class MemberDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	/**
	 * 회원 DB 저장
	 * @param request
	 * @return
	 */
	public boolean register(Member request) {
		String sql = "insert into member (memId, memPw, memNm, email, mobile) + "
				+ "values (?, ?, ?, ?, ?)";
		
		String mobile = null;
		String _mobile = request.getMobile();
		if(_mobile != null) {
			mobile = _mobile.replaceAll("\\D", "");	// 숫자가 아닌 문자를 제거 -> 숫자만 남음
			// ex) 010-1234-5678 -> 01012345678
		}
		
		int affectedRows = jdbcTemplate.update(sql, 
				request.getMemId(), request.getMemPw(), request.getMemNm(), 
				request.getEmail(), mobile);
		
		return affectedRows > 0;	// true: DB 추가 성공
	}
	
	public Member get(String memId) {
		try { 
			String sql ="select * from member where memId = ?";
			Member _member = jdbcTemplate.queryForObject(sql, (rs, i) -> {
	
					Member member = new Member();
					member.setMemNo(rs.getLong("memNo"));
					member.setMemId(rs.getString("memId"));
					member.setMemPw(rs.getString("memPw"));
					member.setMemNm(rs.getString("memNm"));
					member.setEmail(rs.getString("email"));
					member.setMobile(rs.getString("moblie"));
					member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());
					Timestamp modDt = rs.getTimestamp("modDt");
					if(modDt != null) {
						member.setModDt(modDt.toLocalDateTime());
						
						
					}
					return member;
				}, memId);
			
			
			return _member;
		} catch(Exception e) {
			return null;
		}
	}
}
