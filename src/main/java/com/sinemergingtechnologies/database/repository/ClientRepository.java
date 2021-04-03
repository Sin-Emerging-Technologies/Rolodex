package com.sinemergingtechnologies.database.repository;

import com.sinemergingtechnologies.database.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByEmail(String email);
}
