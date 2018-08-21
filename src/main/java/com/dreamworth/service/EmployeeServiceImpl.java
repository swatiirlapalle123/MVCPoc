package com.dreamworth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dreamworth.dao.EmployeeDAO;
import com.dreamworth.dto.EmployeeDTO;
import com.dreamworth.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	
	private EmployeeDAO dao;
	
	public EmployeeDAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}



	@Override
	public String insertEmployee(EmployeeDTO dto) {
		String result=null;
		Employee employee=new Employee();
		employee.setEmpId(dto.getEmpId());
		employee.setEmpName(dto.getEmpName());
		employee.setEmail(dto.getEmail());
		employee.setPassword(dto.toString());
		employee.setBirthDate(dto.getBirthDate());
		employee.setAddress(dto.getAddress());
		
		result=dao.saveEmployee(employee);
		
		return result;
	}

}
