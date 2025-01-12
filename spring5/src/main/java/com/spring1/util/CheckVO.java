package com.spring1.util;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//validation + lombok 활용

@NoArgsConstructor
@AllArgsConstructor
public class CheckVO {
	
	@Id //기본키 항목에 명시해줘야함
	@Size(min=5, max=12, message="아이디 5~12글자 작성")
	@Pattern(regexp="^[a-z0-9]+$", message="영문 소문자와 숫자로만 입력")
	String id;
	
	@NotNull
	@Size(min=8, max=12, message="비밀번호 8~12글자 작성")
	@Pattern(regexp="^[a-zA-Z0-9]+$" ,message="영 소대문자 숫자로 작성")
	String pw;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
