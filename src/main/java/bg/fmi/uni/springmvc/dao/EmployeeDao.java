package bg.fmi.uni.springmvc.dao;

import bg.fmi.uni.springmvc.model.Employee;

import java.util.List;


public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}