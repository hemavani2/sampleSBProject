package pl.piomin.services.employee.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.piomin.services.employee.model.Employee;

public class EmployeeRepository {

	private List<Employee> employees = new ArrayList<>();

	public Employee add(Employee employee) {
		employee.setId((long) (employees.size() + 1));
		employees.add(employee);
		return employee;
	}

	public Employee findById(Long id) {
		Optional<Employee> employee = employees.stream().filter(a -> a.getId().equals(id)).findFirst();
		if (employee.isPresent())
			return employee.get();
		else
			return null;
	}

	public List<Employee> findAll() {
		return employees;
	}

	public List<Employee> findByDepartment(Long departmentId) {
		return employees.stream().filter(a -> a.getDepartmentId().equals(departmentId)).collect(Collectors.toList());
	}

	public List<Employee> findByOrganization(Long organizationId) {
		return employees.stream().filter(a -> a.getOrganizationId().equals(organizationId))
				.collect(Collectors.toList());
	}

	public Employee updateEmpById(Employee employee) {
		Optional<Employee> emp = employees.stream().filter(a -> a.getId().equals(employee.getId())).findFirst();
		if (emp.isPresent()) {
			Employee employee2 = emp.get();
			employee2.setName(employee.getName());
			employee2.setAge(employee.getAge());
			return employee2;
		} else
			return null;
	}

	public List<Employee> deleteEmpById(Long id) {
		//employees.removeIf(e-> e.getId().equals(Id));
		employees = employees.stream().filter(a -> !(a.getId().equals(id))).collect(Collectors.toList());
		return employees;
		
	}

}
