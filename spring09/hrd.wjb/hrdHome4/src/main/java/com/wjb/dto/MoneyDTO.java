package com.wjb.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MoneyDTO {

	private Integer custno;
	private String custname;
	private String grade;
	private Integer price;
}
