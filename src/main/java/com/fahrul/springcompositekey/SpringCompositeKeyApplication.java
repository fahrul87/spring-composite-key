package com.fahrul.springcompositekey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springcompositekey.entity.Employee;
import com.fahrul.springcompositekey.repository.EmployeeRepository;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class SpringCompositeKeyApplication {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	@GetMapping
	public List<Employee> getAll() {
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCompositeKeyApplication.class, args);
	}

}
