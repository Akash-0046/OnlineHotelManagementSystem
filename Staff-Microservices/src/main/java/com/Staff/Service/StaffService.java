package com.Staff.Service;

import java.util.List;

import com.Staff.Model.Staff;
import com.google.common.base.Optional;

public interface StaffService {

	Staff addEmp(Staff emp);

	List<Staff> getAllEmp();

	Optional<Staff> getEmp(long parseLong);

	Staff updateEmp(Staff emp);

	String deleteEmp(long parseLong);

}

