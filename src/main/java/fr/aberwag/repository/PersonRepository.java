package fr.aberwag.repository;

import fr.aberwag.domain.Person;
import fr.aberwag.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findByLastName(String name);
}
