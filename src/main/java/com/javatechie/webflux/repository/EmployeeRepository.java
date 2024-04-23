package com.javatechie.webflux.repository;

import com.javatechie.webflux.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
