package com.example.demo.primenumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrimeNumberController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/findprime")
	public String findPrimeNumbers(@RequestParam int start, @RequestParam int end, Model model) {
		model.addAttribute("start", start);
		model.addAttribute("end", end);
		model.addAttribute("primeNumbers", findPrimesInRange(start, end));
		return "result";
	}

	private String findPrimesInRange(int start, int end) {
		StringBuilder primeNumbers = new StringBuilder();
		for (int number = start; number <= end; number++) {
			if (isPrime(number)) {
				primeNumbers.append(number).append(", ");
			}
		}
		return primeNumbers.toString().isEmpty() ? "No prime numbers found." : primeNumbers.toString();
	}

	private boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}