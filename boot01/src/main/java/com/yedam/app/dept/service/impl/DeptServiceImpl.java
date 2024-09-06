package com.yedam.app.dept.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.dept.mapper.DeptMapper;
import com.yedam.app.dept.service.DeptService;
import com.yedam.app.dept.service.DeptVO;

@Service
public class DeptServiceImpl implements DeptService {
	private DeptMapper deptMapper;
	
	@Autowired
	DeptServiceImpl(DeptMapper deptMapper){
		this.deptMapper = deptMapper;
	}
	
	@Override
	public List<DeptVO> deptList() {
		return deptMapper.selectDeptAll();
	}

	@Override
	public DeptVO deptInfo(DeptVO deptVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deptInsert(DeptVO deptVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> deptUpdate(DeptVO deptVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deptDelete(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
