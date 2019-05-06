package com.market.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("User")
	public ModelAndView conectarBBDD()
	{
		Market_BL.UserBL.darUsuarios();
		ModelAndView MV = new ModelAndView();
		MV.setViewName("UserView");
		
		return MV;
		
	}
}
