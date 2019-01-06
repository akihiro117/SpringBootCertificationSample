package com.webapp.certificationtest.entity;

/**
 * ログインに必要な会員情報を格納するクラス。
 */
public class Account {

	private String name;

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
