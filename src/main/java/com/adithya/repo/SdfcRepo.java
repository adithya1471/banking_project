package com.adithya.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adithya.model.Sdfc;
@Repository
public interface SdfcRepo extends CrudRepository<Sdfc, Integer> {

	
}
