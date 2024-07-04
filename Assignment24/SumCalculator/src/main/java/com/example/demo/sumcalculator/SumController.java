package com.example.demo.sumcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/sum")
	public String calculateSum(@RequestParam int num1, @RequestParam int num2, Model model) {
		int sum = num1 + num2;
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("sum", sum);
		return "result";
	}
}