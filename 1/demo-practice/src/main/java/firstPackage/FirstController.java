package firstPackage;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello";
	}
	
	@PostMapping("/post-request")
	//here passing list should be in json format
	public List<String> postList(@RequestBody List<String> list) {
		return list;
	}

	
}
