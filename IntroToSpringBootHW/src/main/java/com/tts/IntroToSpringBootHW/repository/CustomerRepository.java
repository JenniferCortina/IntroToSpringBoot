package com.tts.IntroToSpringBootHW.repository;

import com.tts.IntroToSpringBootHW.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
