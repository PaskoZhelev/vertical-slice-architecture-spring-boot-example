package com.mnp.verticalslicesspring.shared.repository;

import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}

