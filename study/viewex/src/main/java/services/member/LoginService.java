package services.member;

import javax.servlet.http.HttpSession;

import org.mindrot.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controllers.members.LoginRequest;
import models.member.Member;
import models.member.MemberDao;


@Service
public class LoginService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private HttpSession session;
	
	public void process(LoginRequest loginRequest) {
		/**
		 * 1. 아이디로 조회했을 때 회원이 존재하는지 확인 필요
		 * 2. 회원이 존재하면, 비밀번호 일치여부 확인 필요
		 * 3. 일치하면, 로그인 처리 -> 세션 저장 처리
		 */
		
		String memId = loginRequest.getMemId();
		Member member = memberDao.get(memId);
		if(member == null) {
			throw new RuntimeException("가입되지 않은 아이디 입니다");
		}
		
		String memPw = loginRequest.getMemPw();
		boolean matched = BCrypt.checkpw(memPw, member.getMemPw());
		
		// 비밀번호가 일치하지 않는 경우
		if(!matched) {
			throw new RuntimeException("비밀번호가 일치하지 않습니다");
		}
		
		// 비밀번호가 일치하는 경우
		session.setAttribute("member", memPw);
	}
}
