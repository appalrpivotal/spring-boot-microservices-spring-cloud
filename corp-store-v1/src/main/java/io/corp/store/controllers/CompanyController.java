package io.corp.store.controllers;

import io.corp.store.domain.Company;
import io.corp.store.repositories.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController{
	
	    @Autowired
	    CompanyRepository repository;

	    @RequestMapping("/")
	    public Iterable<Company> fortunes() {
	        return repository.findAll();
	    }

}
