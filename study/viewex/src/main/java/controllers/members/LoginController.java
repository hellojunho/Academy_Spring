package controllers.members;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import services.member.LoginService;

@Controller
@RequestMapping("/member/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping
	public String login(Model model) {
			
		LoginRequest loginRequest = new LoginRequest();
		model.addAttribute("loginRequest", loginRequest);
		
		return "member/login";
	}
	
	@PostMapping
	public String loginPs(@Valid LoginRequest loginRequest, Errors errors) {
		// Errors -> hasErrors() // rejectValue, reject
		
		if(errors.hasErrors()) {
			return "member/login";
		}
		
		// 로그인 처리 부분
		loginService.process(loginService);
		
		
		return "redirect:/";
	}
}
