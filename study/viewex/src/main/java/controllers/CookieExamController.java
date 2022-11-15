package controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CookieExamController {
	
	@GetMapping
	public void exam(HttpServletResponse r) {
		Cookie cookie = new Cookie("key1", "value2");
		cookie.setMaxAge(60*60*24*7);	// 1주일 뒤 만료
		r.addCookie(cookie); 	// 응답헤더 : Set-Cookie:key1=value1
	}
	
	@GetMapping("/ex02")
	public void exam2(HttpServletRequest rq) {
		Cookie[] cookies = rq.getCookies();
		
		for (Cookie cookie:cookies) {
			System.out.printf("name=%s,value=%s\n", cookie.getName(), cookie.getValue());
		}
	}
	
	@GetMapping("/ex03")
	public void exam3(@CookieValue("key1") String name) {
		System.out.println(name);
	}
	
}
