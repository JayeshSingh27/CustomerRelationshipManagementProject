package in.myproject.repository;
import in.myproject.model.*;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
