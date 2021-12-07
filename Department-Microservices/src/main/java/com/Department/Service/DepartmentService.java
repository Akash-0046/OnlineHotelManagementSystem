package com.Department.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Department.Model.Department;
import com.google.common.base.Optional;

@Service
public interface DepartmentService {
	
	Department addDepartment(Department dept);
	
	List<Department> getAlldept();
	
	Optional<Department> getDepartment(long parseLong);
	
	Department updateDepartment(Department dept);
	
	String deleteDepartment(long parseLong);

}
