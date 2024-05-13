package com.spring1.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok 활용

@Data // 넣으면 get set 안넣어도됨
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Check {

	private String id;
	private String pw;
	
}
