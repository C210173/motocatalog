package com.example.bean;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Motorcycle {
	private Integer motoNo;
	private String motoName;
	private Integer seatHeight;
	private Integer cylinder;
	private String colling;
	private Integer price;
	private String comment;
	private Brand brand;
	private Integer version;
	private LocalDateTime insDt;
	private LocalDateTime updDt;

}
