package hello;

import java.util.List;

import org.hibernate.criterion.Criterion;

public interface CustomerRepositoryCustom {

	/**
	 * 
	 * @param criterions
	 * @return
	 */
	List<Customer> findByCriteria(Criterion... criterions);
}
