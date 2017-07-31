package com.marriageonmind.test;
/*package com.marriageonmind.service;


	import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marriageonmind.exception.PersonNotFound;
import com.marriageonmind.model.Person;
import com.marriageonmind.repository.PersonRepository;
	 
	@Service
	
	public class PersonServiceImpl implements PersonService {
	     
	    @Resource
	    private PersonRepository PersonRepository;
	 
	    @Override
	    @Transactional
	    public Person create(Person Person) {
	        Person createdPerson = Person;
	        return PersonRepository.save(createdPerson);
	    }
	     
	    @Override
	    @Transactional
	    public Person findById(int id) {
	        return PersonRepository.findOne(id);
	    }
	 
	    @Override
	    @Transactional(rollbackFor=PersonNotFound.class)
	    public Person delete(int id) throws PersonNotFound {
	        Person deletedPerson = PersonRepository.findOne(id);
	         
	        if (deletedPerson == null)
	            throw new PersonNotFound("nothing deleted");
	         
	        PersonRepository.delete(deletedPerson);
	        return deletedPerson;
	    }
	 
	    @Override
	    @Transactional
	    public List<Person> findAll() {
	        return PersonRepository.findAll();
	    }
	 
	    @Override
	    @Transactional(rollbackFor=PersonNotFound.class)
	    public Person update(Person Person) throws PersonNotFound {
	        Person updatedPerson = PersonRepository.findOne(Person.getId());
	         
	        if (updatedPerson == null)
	            throw new PersonNotFound("nothing deleted");
	         
	        updatedPerson.setName(Person.getName());
	        updatedPerson.setEmplNumber(Person.getEmplNumber());
	        return updatedPerson;
	    }
	 
	}
*/