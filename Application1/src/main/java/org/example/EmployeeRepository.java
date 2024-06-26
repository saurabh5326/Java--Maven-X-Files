package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.Employee;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee , Long> {
    Optional <Employee> findByName(String name);
}
