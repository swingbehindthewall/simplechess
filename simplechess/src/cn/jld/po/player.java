package cn.jld.po;

import java.io.Serializable;

public class player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nickname;
	private String password;
	
	public player() {
		// TODO Auto-generated constructor stub
	}
	
	public player(int id,String nickname, String password) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.password = password;
	}
	
	
	public player(String nickname, String password) {
		super();
		this.nickname = nickname;
		this.password = password;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
