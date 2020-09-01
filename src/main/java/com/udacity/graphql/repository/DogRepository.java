package com.udacity.graphql.repository;

import com.udacity.graphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository  extends CrudRepository<Dog,Long> {

}
