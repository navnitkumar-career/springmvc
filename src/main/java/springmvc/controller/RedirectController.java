package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/firstHandler")
	public String firstHandler() 
	{
		System.out.println("This is first Handler");
		return "redirect:/secondHandler";
	}
	@RequestMapping("/secondHandler")
	public String secondHandler() 
	{
		System.out.println("This is Second Handler");
		return "";
	}
	@RequestMapping("/thirdHandler")
	public RedirectView thirdHandler()
	{
		System.out.println("This is Second Handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("secondHandler");
		return redirectView;
	}
}
