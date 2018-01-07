package hello;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findByCriteria(Criterion... criterions) {
		Session session = (Session) em.getDelegate();
		Criteria criteria = session.createCriteria(Customer.class);
		for (Criterion criterion : criterions) {
			criteria.add(criterion);
		}
		return criteria.list();
	}

}
