package com.wjb.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MoneyDTO {

	private int custno;
	private int saleno;
	private int pcost;
	private int amount;
	private int price;
	private char pcode;
	private Date sdate;
}
