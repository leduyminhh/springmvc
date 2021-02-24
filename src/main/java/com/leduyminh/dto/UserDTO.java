package com.leduyminh.dto;

//Data Transfer Object
public class UserDTO extends AbstractDTO<UserDTO>{
	private String userName;
	private String passWord;
	private String fullName;
	private int status;
	private int roleId;
	private RoleDTO role = new RoleDTO();
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleDTO getRole() {
		return role;
	}
	public void setRole(RoleDTO role) {
		this.role = role;
	}
}
