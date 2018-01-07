package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>, CustomerRepositoryCustom {

	/**
	 * Retrives an entity by its lastName
	 *
	 * @param lastName must not be null
	 *
	 * @return the entity with the given lastName or null if none found
	 */
	List<Customer> findByLastName(String lastName);
}
