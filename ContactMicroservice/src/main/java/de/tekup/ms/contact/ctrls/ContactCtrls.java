package de.tekup.ms.contact.ctrls;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/contact")
@AllArgsConstructor
public class ContactCtrls {
	
	private ServletWebServerApplicationContext webServerApplicationContext;
	
	@GetMapping("/check")
	public String checkMSStatus() {
		return "hello I am "+ webServerApplicationContext.getApplicationName()
		+ ", running on Port : "+webServerApplicationContext.getWebServer().getPort();
	}

}
