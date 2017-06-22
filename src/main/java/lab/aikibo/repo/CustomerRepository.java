package lab.aikibo.repo;

import lab.aikibo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

/**
 * Created by tamami on 22/06/17.
 */
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByName(@Param("name") String name);

}
