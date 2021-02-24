package com.leduyminh.dto;

//Data Transfer Object
public class RoleDTO extends AbstractDTO<RoleDTO>{
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
