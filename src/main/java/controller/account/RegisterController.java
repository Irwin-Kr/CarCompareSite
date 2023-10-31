package controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
	
	@GetMapping("/register")
	public String register(Model model) {
		
		model.addAttribute("addCss", "register");
		
		return "account/register";
	}

	@PostMapping("/register")
	public String registUser() {
		
		return "/login";
	}
	
}
