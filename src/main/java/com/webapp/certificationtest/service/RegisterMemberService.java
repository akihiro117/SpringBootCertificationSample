//RegisterMemberService.java
//Created by Akihiro Yamada on 2019/1/3.
//Copyright (c) 2018. All Rights Reserved.

package com.webapp.certificationtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.certificationtest.entity.MemberRegistrationEntity;
import com.webapp.certificationtest.mapper.RegisterMemberMapper;

@Service
@Transactional
public class RegisterMemberService {

	@Autowired
	RegisterMemberMapper registerMemberMapper;

	@Autowired
	PasswordEncoder passwordEncoder;

	/**
	 * 会員情報をDBに登録。
	 */
	public void registerMember(MemberRegistrationEntity entity) {

		//パスワードをハッシュ化して、insertする時の引数にセット。
		entity.setPassword(passwordEncoder.encode(entity.getPassword()));

		//会員情報をUSERテーブルにinsert。
		registerMemberMapper.insertMemberInfo(entity);
	}
}
