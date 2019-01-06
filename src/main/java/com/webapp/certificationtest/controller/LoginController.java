//LoginController.java
//Created by Akihiro Yamada on 2019/1/3.
//Copyright (c) 2018. All Rights Reserved.

package com.webapp.certificationtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	/**
	 * ログイン画面 に遷移する。
	 */
	@RequestMapping("/login")
	public String showLoginForm(Model model) {

		//ログイン画面。
		return "Login";
	}

	/**
	 * メインページに遷移する。
	 * ログインが成功した場合、このメソッドが呼び出される。
	 */
	@RequestMapping("/")
	public String login(Model model) {

		//メインページ。
		return "index";
	}

}
