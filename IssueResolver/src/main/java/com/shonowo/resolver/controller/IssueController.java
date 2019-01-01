package com.shonowo.resolver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shonowo.resolver.model.Issue;
import com.shonowo.resolver.service.IssueService;

@Controller
public class IssueController {

	@Autowired
	private IssueService issueService;
	
	@GetMapping
	@ResponseBody
	public List<Issue> getAllIssues(){
		return issueService.getAll();
	}
	
	@GetMapping("/issue")
	public String issueForm() {
		return "issue";
	}
	
	@PostMapping("/issue")
	public ModelAndView issueSubmit(@RequestParam("terminalId") String terminalId,
								@RequestParam("issue") String issue,
								@RequestParam("logger") String logger,
								@RequestParam("loggerEmail") String loggerEmail,
								@RequestParam("loggerPhoneNo") String loggerPhoneNo){
		
		Issue atmIssue = issueService.getATMIssue(terminalId, issue, logger, loggerEmail, loggerPhoneNo);
		issueService.save(atmIssue);
		ModelAndView model= new ModelAndView("result");
		model.addObject("atmIssue",atmIssue);
		return model;
	}
	
	@GetMapping("/addIssue")
	public String issueForm(Issue atmIssue) {
		issueService.save(atmIssue);
		return "issueLogged";
	}
}
