//LoginMapper.java
//Created by Akihiro Yamada on 2019/1/3.
//Copyright (c) 2018. All Rights Reserved.

package com.webapp.certificationtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.webapp.certificationtest.entity.Account;

@Mapper
public interface LoginMapper {

	//USERテーブルからユーザ名とパスワードを取得。
	public Account findAccount(String name);
}
