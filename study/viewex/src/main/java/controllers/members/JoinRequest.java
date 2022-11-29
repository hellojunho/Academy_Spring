package controllers.members;

public class JoinRequest {
	private String memId;
	private String memPw;
	private String memPwRe;
	private String memNm;
	private String email;
	private String mobile;
	private boolean agree;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemPwRe() {
		return memPwRe;
	}
	public void setMemPwRe(String memPwRe) {
		this.memPwRe = memPwRe;
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
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	
	
	@Override
	public String toString() {
		return "JoinRequest [memId=" + memId + ", memPw=" + memPw + ", memPwRe=" + memPwRe + ", memNm=" + memNm
				+ ", email=" + email + ", mobile=" + mobile + ", agree=" + agree + "]";
	}

}
