package com.Staff.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Staff.Model.Staff;
import com.Staff.Repository.StaffMongodbRepo;
import com.google.common.base.Optional;

@Service
public class StaffServiceImpl implements StaffService{
	
	
	@Autowired
	StaffMongodbRepo staffmongodbRepo;

	@Override
	public Staff addEmp(Staff emp) {
		// TODO Auto-generated method stub
		return staffmongodbRepo.insert(emp);
	}

	@Override
	public List<Staff> getAllEmp() {
		// TODO Auto-generated method stub
		return staffmongodbRepo.findAll();
	}

	@Override
	public Optional<Staff> getEmp(long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff updateEmp(Staff emp) {
		// TODO Auto-generated method stub
		return staffmongodbRepo.save(emp);
	}

	@Override
	public String deleteEmp(long parseLong) {
		staffmongodbRepo.deleteById(parseLong);
		return "Deleted employee with ID :" + parseLong;
	}

}
