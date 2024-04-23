package com.javatechie.webflux.controller;


import com.javatechie.webflux.dto.EmployeeDto;
import com.javatechie.webflux.entity.Employee;
import com.javatechie.webflux.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<Employee> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping("/employee{id}")
    public  Mono<EmployeeDto> getEmployee(@PathVariable("id") String employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @GetMapping
    public Flux<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmloyees();
    }

    @PutMapping("/update{id}")
    public Mono<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,
                                            @PathVariable String employeeId){
        return employeeService.updateEmployee(employeeDto, employeeId);
    }

    @DeleteMapping("/delete")
    public Mono<Void> deleteEmployee(@PathVariable("id") String employeeId){
       return employeeService.deleteEmployee(employeeId);
    }
}
