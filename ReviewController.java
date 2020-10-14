package target.classes.com.powerreviews.project.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import Service.ReviewService;

@Controller
@SessionAttributes("name")
public class ReviewController {
@Autowired 
ReviewService service;



//	@RequestMapping(value = "/list-reviews", method = RequestMethod.GET)
//	public String showTodos(ModelMap model) {
//		String name = (String) model.get("name");
//		model.put("reviews", service.returnReviews(name));
//		return "/welcome-page";
//	}

@RequestMapping(value = "/list-reviews", method = RequestMethod.GET)
public String showreviews(ModelMap model) {
	String name = getLoggedInUserName(model);
	model.put("reviews", service.returnReviews(name));
	return "list-reviews";
}
private String getLoggedInUserName(ModelMap model) {
	return (String) model.get("name");
}
	}

//@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
//public String showTodos(ModelMap model) {
//	String name = getLoggedInUserName(model);
//	model.put("todos", service.retrieveTodos(name));
//	return "list-todos";
