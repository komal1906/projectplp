package com.capgemini.capstore.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.capstore.repo.RatingRepo;

@Transactional
@Service("service")
public class RatingServicesImpl implements RatingServices{

	@Autowired
	RatingRepo repo;
	

	public RatingRepo getRepo() {
		return repo;
	}

	public void setRepo(RatingRepo repo) {
		this.repo = repo;
	}

	@Override
	public void avgRating(long prodid) {
		return;
	}
}