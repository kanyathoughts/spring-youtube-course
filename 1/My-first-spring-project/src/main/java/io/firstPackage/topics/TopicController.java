package io.firstPackage.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	//Already registered instance for business service will handle the dependencies between controller and business service
	@Autowired
	private TopicService topicService;
	

	@GetMapping("/topics")
	public List<Topic> allTopics() {
		return topicService.topics;
	}
	
	@GetMapping("/new")
	public String newConcept() {
		Topic obj1 = new Topic();
		obj1.setId("2");
		return obj1.getId();
		
	}
	
	//The syntax for mentioning path variable is to give inside the curly braces
	//We have to tell the Spring that whatever I'm passing in path that will be used as method argument
	//You can mention, this is path variable so take that variable and pass it as argument to the method
	@GetMapping("/topics/{id}")
	public Topic getParticularTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//you can mention like this as well but you need to explicitly mention that take that foo path varaible as the method argument because here foo and id are different names
	//If the names are same you don't need to mention again
	@GetMapping("/topics/{foo}")
	public Topic getParticularTopicFromFoo(@PathVariable("foo") String id) {
		return topicService.getTopic(id);
	}
	
	//Whatever we are passing in the request body that will be considered as Topic and that topic will be added to existing topics
	//We can add the new topic in the body section of request in postman and then give header as content-type=application/json then send the post request
	@PostMapping("/topics")
	public List<Topic> postAllTopics(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	//Both post and put requests need request body where you need to specify the updated topic and which is going to be updated
	@PutMapping("/topics/{id}")
	public List<Topic> updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		return topicService.updateTopic(id, topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public List<Topic> deleteTopic(@PathVariable String id) {
		return topicService.deleteTopic(id);
	}
}
