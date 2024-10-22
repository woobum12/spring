package com.wjb.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class MemberDTO {
	
	@NoArgsConstructor
	@Getter
	@Setter
	@ToString
	public class BoardDTO {
		private int custno;
		private String custname;
		private String phone;
		private String address;
		private Date joindate;
		private String grade;
		private String city;
	}
}
