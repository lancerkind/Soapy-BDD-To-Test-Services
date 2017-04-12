package service;
import java.util.Hashtable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.*;

@RestController
public class PresenceController {
	
	@RequestMapping("/all")
	public Hashtable<String, Person> getAll(){
		Hashtable<String, Person> empty = new Hashtable<String, Person>();
		Person mary = new Person();
		mary.setFirstName("Mary");
		mary.setLastName("Poppins");
		
		empty.put("room Id", mary);
		return empty;
	}
	
	@RequestMapping("{room_id}")
	public Person getPerson(@PathVariable("room_id") String room_id) {
		return new Person();
	}
}
