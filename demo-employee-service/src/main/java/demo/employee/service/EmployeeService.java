package demo.employee.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author Denuwan Himanga Hettiarachchi
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EmployeeService {
	
    public static void main( String[] args ){
       SpringApplication.run(EmployeeService.class, args);
    }
}
