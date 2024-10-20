package com.tsp.service;

import org.springframework.stereotype.Service;

import com.tsp.entity.Address;
import com.tsp.entity.Employee;
import com.tsp.repo.AddressRepository;
import com.tsp.repo.EmployeeRepository;

import jakarta.transaction.Transactional;
@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	private AddressRepository addressRepository;
	
	
	
	
	
	public EmployeeService(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.addressRepository = addressRepository;
	}
//	@Transactional(rollback = Exception.class)
//	public void getDataByusingPk()
//	{
//		AccountPk pk = new AccountPk();
//		pk.setAccId(101);
//		pk.setAccType("Savings");
//		pk.setHolderName("Tcs");
//		
//		Optional<Account> findById  = accountRepository.findById(pk);
//		if(findById.isPresent())
//		{
//			System.out.println(findById.get());
//		}
//		
//	}
	@Transactional(rollbackOn = Exception.class)
	public void saveData()
	{
		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("abc");
		emp.setEmpSal(122.0);
		employeeRepository.save(emp);
		
		
		Address addr = new Address();
		addr.setAddId(51);
		addr.setEmpId(123);
		addr.setCity("Nandyal");
		addr.setState("TS");
		addr.setCountry("Ind");
		addressRepository.save(addr);
		
		
	}

}
