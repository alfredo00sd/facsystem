package com.integra.opensource.practica6;

import com.integra.opensource.practica6.models.BillDetails;
import com.integra.opensource.practica6.models.Employee;
import com.integra.opensource.practica6.repositories.BillRepository;
import com.integra.opensource.practica6.repositories.EmployeeRepository;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica6Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//@Autowired
	//private EmployeeRepository employeeRepository;
	@Autowired
	private BillRepository billRepository;

	@Override
	public void run(String... args) throws Exception {

//		logger.info("Inserting -> {}", billRepository
//				.insert(new BillDetails(0, 1, 1, 2, 5)));
//		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10012L, "John", "Cena", "john@gmail.com")));
//		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10013L, "tony", "stark", "stark@gmail.com")));
//
//		logger.info("Employee id 10011 -> {}", employeeRepository.findById(10011L));
//
//		logger.info("Update 10003 -> {}", employeeRepository.update(new Employee(10011L, "ram", "Stark", "ramesh123@gmail.com")));
//
//		employeeRepository.deleteById(10013L);
//
//		logger.info("All users -> {}", employeeRepository.findAll());
	}

	public static void main(String[] args) {
		SpringApplication.run(Practica6Application.class, args);
	}

}
