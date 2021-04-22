package com.company;

import com.company.dao.EmployeeRepository;
import com.company.model.Employee;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories
public class CargoWebAppJpaSpringApplication {

//	@Autowired
//	private EmployeeRepository employeesRepository;


	public static void main(String[] args) {
		SpringApplication.run(CargoWebAppJpaSpringApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

//	@Bean
//	public CommandLineRunner run() {
//		CommandLineRunner clr = new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//
//				System.out.println(employeesRepository.getClass().getName());
//			}
//		};
//		return clr;
//	}

}
