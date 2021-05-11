package com.sinemergingtechnologies.database.repository;

import com.sinemergingtechnologies.database.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findByRoleTitle(String roleTitle);
}
