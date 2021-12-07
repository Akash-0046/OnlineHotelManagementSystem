package com.Department.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.Department.Model.Department;
import com.Department.Repository.DepartmentRepo;
import com.google.common.base.Optional;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo repo;
	
	@Override
	public Department addDepartment(Department dept) {
		// TODO Auto-generated method stub
		return repo.insert(dept);
	}

	@Override
	public List<Department> getAlldept() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Department> getDepartment(long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		return repo.save(dept);
	}

	@Override
	public String deleteDepartment(long parseLong) {
		// TODO Auto-generated method stub
		repo.deleteById(parseLong);
		return "Department Deleted";
	}

}
