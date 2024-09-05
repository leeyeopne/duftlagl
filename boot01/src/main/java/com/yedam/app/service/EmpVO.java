package com.yedam.app.service;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@NoArgsConstructor   //기본생성자
@Getter
@Setter
@ToString
public class EmpVO {
	private Integer employeeId; 	// 사원번호 : Primary Key
	private String firstName;		// 이름
	private String lastName;		// 성 : not null 
	private String email;			// 이메일 : not null
	private String phoneNumber; 	// 연락처
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;			// 입사일자 : not null
	private String jobId;			// 업무 : not null, Foreign Key
	private Double salary;			// 급여 : >0
	private Double commissionPct;	// 상여금 : 급여를 기준으로
	private Integer managerId;		// 상사번호 : Foreign Key
	private Integer departmentId;	// 부서번호 : Foreign Key
	
}
