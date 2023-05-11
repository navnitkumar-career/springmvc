package springmvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void CommonDataForAll(Model m) {
		m.addAttribute("header", "Registration");
	}

	@RequestMapping("/registration")
	public String about(Model m) {
		System.out.println("this is registration controller");
		return "registration";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String getRegistrationData(@ModelAttribute User user, Model model) {
		/*
		 * model.addAttribute("email", email); model.addAttribute("password", password);
		 * model.addAttribute("username", uName);
		 */
		// model.addAttribute("user" , user);
		System.out.println(user);
//		if (user.getEmail().isBlank()) {
//			return "redirect:/registration";
//		}
		int createUser = this.userService.createUser(user);
		model.addAttribute("successmessage", "User Inserted Successfully" + createUser);
		return "successRegistration";
	}
	
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String getRegistrationData(@RequestParam(name = "email", required = true)
	 * String email,
	 * 
	 * @RequestParam("username") String uName,erver
	 * 
	 * 
	 * @RequestParam("password") String password, Model model) {
	 * 
	 * // System.out.println("this is about controller"); // HttpServletRequest
	 * request // String email = request.getParameter("email"); // String uName =
	 * request.getParameter("username"); // String password =
	 * request.getParameter("password");
	 * 
	 * System.out.println("Email is : " + email);
	 * System.out.println("User Name is : " + uName);
	 * System.out.println("Password is : " + password); model.addAttribute("email",
	 * email); model.addAttribute("password", password);
	 * model.addAttribute("username", uName); return "successRegistration"; }
	 */
}

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String getRegistrationData(@RequestParam(name = "email", required = true)
 * String email,
 * 
 * @RequestParam("username") String uName,
 * 
 * @RequestParam("password") String password, Model model) {
 * 
 * User u = new User(); u.setEmail(email); u.setUsername(uName);
 * u.setPassword(password); model.addAttribute("user", u);
 * 
 * 
 * model.addAttribute("email", email); model.addAttribute("password", password);
 * model.addAttribute("username", uName);
 * 
 * return "successRegistration"; }
 */