package com.yedam.app.service;

import java.util.List;
import java.util.Map;

public interface EmpService {
	// 전체 사원정봊 회
	public List<EmpVO> empList();
	// 사원정보 단건 조회
	public EmpVO empInfo(EmpVO empVO);
	// 사원정보 단건 등록
	public int empInsert(EmpVO empVO);
	// 사원정보 단건 수정
	public Map<String, Object> empUpdate(EmpVO empVO);
	// 사원정보 단건 삭제
	public Map<String, Object> empDelete(int empId);
}
