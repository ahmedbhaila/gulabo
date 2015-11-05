package com.example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GulaboController {
	@RequestMapping(value="/gulabo/callback")
	@ResponseBody
	public void handleBoxCallback(@RequestParam Map<String,String> allRequestParams) throws Exception {
		System.out.println("Hi, I am gulabo");
	}
}
