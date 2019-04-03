package com.capgemini.capstore.repo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository("repo")
public class RatingRepoImpl implements RatingRepo{

	@PersistenceContext
	EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void avgRating(long prodid) {
		
		List<Long> rate1 = entityManager.createQuery("SELECT f FROM product_feedback f WHERE f.prodid IN :pid").setParameter("pid", prodid).getResultList();
		double sum=0.0;
		double avg;
		for(long i:rate1)
		{
			sum+=i;
		}
		avg=sum/rate1.size();
		entityManager.setProperty("rating",avg);
		entityManager.persist(rate1);
		return ;
	}
}
