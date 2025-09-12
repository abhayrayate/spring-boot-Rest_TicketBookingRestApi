package in.abhayit.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	MsgRestController()
	{
		System.out.println("MsgRestController::Constructor");
		
	}
	//request ani response handle kryala method write krychi ahe 
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelmsg()
	{
		String msg ="Welcome to Abhay It!!!";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		return "Hello ,Good Evening======>";
	}
}
