package com.prathamesh.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {

	
	//"say_hello" => "Hello! What are you learning Today?"
//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning Today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		
		StringBuffer sb =  new StringBuffer();
		sb.append("");
		
		return "Hello! What are you learning Today?";
	}

	
	//  "say-hello-jsp" = >    sayHello.jsp
	///src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp

	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
