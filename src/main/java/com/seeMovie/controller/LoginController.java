package com.seeMovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author 		mym
 * @date   		2018年7月31日下午3:15:27
 * @describe	登录相关操作
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	/**
	 * 
	 * @author 		mym
	 * @date   		2018年7月31日下午3:19:31
	 * @describe	
	 * @return		String
	 *
	 */
	@RequestMapping("/toLoginPage")
	public String goToLoginPage(){
			return "theBackGround/login";
	}
	/**
	 * 
	 * @author 		mym
	 * @date   		2018年7月31日下午10:59:09
	 * @describe	登录成功进入主页否则重定向到登录页
	 * @return		String
	 *
	 */
	@RequestMapping("/login")
	public String login(){
			return "theBackGround/index";
	}
}
