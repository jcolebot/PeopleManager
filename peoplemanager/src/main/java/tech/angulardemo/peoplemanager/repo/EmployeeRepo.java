package tech.angulardemo.peoplemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.angulardemo.peoplemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // Query method
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
