package io.corp.store.repositories;

import io.corp.store.domain.Company;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long>{

}
