package controllers.members;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import models.member.Member;

@Controller
@RequestMapping("/member")
public class JoinController {
	
	@GetMapping("/form")
	public String form(Model model) {
		
		Member member = new Member();
		member.setMemId("user01");
		member.setMemNm("사용자01");
		member.setEmail("user01@test.org");
		member.setMobile("010-0000-0000");
		member.setRegDt(LocalDateTime.now());
		member.setIntro("<h1>자기소개</h1>");
		
		model.addAttribute("member", member);
		
		return "member/form";
	}
	
	@GetMapping("/join")
	public String join(Model model) {
		
		JoinRequest joinRequest = new JoinRequest();
		model.addAttribute("joinRequest", joinRequest);
		
		return "member/join";
	}
	
	@PostMapping("/join")
//	@RequestMapping("/join_ps")
	public String joinPs(JoinRequest joinRequest) {		
		// @RequestParam을 안쓰고 사용하려면, 파라미터 이름이 요청한 파라미터와 이름이 동일해야 함
		System.out.println(joinRequest);
		
		return "member/join";
	}
}
