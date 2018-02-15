package fr.aberwag;

import fr.aberwag.domain.Person;
import fr.aberwag.domain.User;
import fr.aberwag.repository.PersonRepository;
import fr.aberwag.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJavaKotlinApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJavaKotlinApplication.class, args);
		initUsers(ctx.getBean(UserRepository.class));
		initPersons(ctx.getBean(PersonRepository.class));
	}
	
	public static void initUsers(UserRepository userRepository){
		userRepository.save(new User("Homer", "simpson"));
		userRepository.save(new User("Marge", "simpson"));
		userRepository.save(new User("Bart", "simpson"));
		userRepository.save(new User("Lisa", "simpson"));
		userRepository.save(new User("Maggie", "simpson"));
		userRepository.save(new User("Ned", "Flanders"));
		userRepository.save(new User("Apu", "Nahasapeemapetilon"));
		userRepository.save(new User("Barney", "Gumble"));
		userRepository.save(new User("Chef", "Wiggum"));
		userRepository.save(new User("Edna", "Krapabelle"));
		userRepository.save(new User("Seymour", "Skinner"));
		userRepository.save(new User("Otto", "Bus"));
		userRepository.save(new User("Carl", "Carlson"));
		userRepository.save(new User("Lenny", "Leonard"));
	}
	
	public static void initPersons(PersonRepository personRepository){
		personRepository.save(new Person("Gumball", "Watterson"));
		personRepository.save(new Person("Darwin", "Watterson"));
		personRepository.save(new Person("Nicole", "Watterson"));
		personRepository.save(new Person("Richard", "Watterson"));
		personRepository.save(new Person("Anaïs", "Watterson"));
		personRepository.save(new Person("Joe", "Banane"));
		personRepository.save(new Person("Tina", "Rex"));
		personRepository.save(new Person("Tobias", "Wilson"));
		personRepository.save(new Person("Rocky", "Robinson"));
		personRepository.save(new Person("Gellort", "Robinson"));
		personRepository.save(new Person("Nigel", "Brown"));
		personRepository.save(new Person("Hector", "Hector"));
		personRepository.save(new Person("Suzie", "Suzie"));
		personRepository.save(new Person("William", "William"));
	}
}