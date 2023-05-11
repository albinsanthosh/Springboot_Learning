package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeRespository;
import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRespository employeeRespository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRespository theEmployeeRespository){
        employeeRespository = theEmployeeRespository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRespository.findById(theId);

        Employee theEmployee = null;

        if(result.isPresent()){
            theEmployee = result.get();
        }
        else{
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRespository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRespository.deleteById(theId);
    }
}
