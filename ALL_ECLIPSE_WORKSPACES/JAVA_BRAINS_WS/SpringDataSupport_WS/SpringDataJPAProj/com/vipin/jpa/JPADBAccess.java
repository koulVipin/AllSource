package com.vipin.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vipin.model.*;

@Repository
public interface JPADBAccess extends CrudRepository<User, Integer>{

}