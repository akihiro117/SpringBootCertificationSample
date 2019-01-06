//MemberRegistrationController.java
//Created by Akihiro Yamada on 2019/1/3.
//Copyright (c) 2018. All Rights Reserved.

package com.webapp.certificationtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.certificationtest.entity.MemberRegistrationEntity;
import com.webapp.certificationtest.form.MemberRegistrationForm;
import com.webapp.certificationtest.service.RegisterMemberService;

@Controller
public class MemberRegistrationController {

	@Autowired
	private RegisterMemberService registMemberService;

	/**
	 * 会員情報入力画面に遷移する。
	 */
	@RequestMapping("/RegistrationForm")
	public String showRegistMemberForm(Model model) {

		model.addAttribute(new MemberRegistrationForm());

		//会員情報入力画面。
		return "RegistrationForm";
	}

	@RequestMapping("/Register")
	public String registerUser(@ModelAttribute MemberRegistrationForm memberRegistrationForm) {

		//USERテーブルにinsertする時の引数。
		MemberRegistrationEntity entity = new MemberRegistrationEntity();

		entity.setUserName(memberRegistrationForm.getUserName());
		entity.setPassword(memberRegistrationForm.getPassword());

		//USERテーブルにinsertする。
		registMemberService.registerMember(entity);

		return "Result";
	}
}
