package models.member;

import java.time.LocalDateTime;

// 회원 정보가 담기는 DTO 객체
public class Member {
	private String memId;
	private String memNm;
	private String email;
	private String mobile;
	private LocalDateTime regDt;
	private String intro;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDateTime getRegDt() {
		return regDt;
	}
	public void setRegDt(LocalDateTime regDt) {
		this.regDt = regDt;
	}
	
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memNm=" + memNm + ", email=" + email + ", mobile=" + mobile + ", regDt="
				+ regDt + "]";
	}
	
	
}
