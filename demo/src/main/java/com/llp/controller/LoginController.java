package com.llp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {




	/**
	 * 进入首页
	 * 
	 * @return
	 */
	@RequestMapping("/main")
	public String main() {
		return "front/main";
	}


}
