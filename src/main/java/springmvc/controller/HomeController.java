package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home" , method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("this is home controller");
		model.addAttribute("name","Brijesh Savaliya");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Aryan");
		friends.add("Jeet");
		friends.add("Maulik");
		model.addAttribute("friends",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Aryan Bhadani");
		
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		modelAndView.addObject("mark",list);
		modelAndView.addObject("marks",list);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
