package com.mgureken.web.jsf.beans;

import javax.faces.bean.ManagedBean;

//dosyanin bean olmasi icin asagidaki annotation eklenmeli
@ManagedBean
public class adminBean {
	private String name="Murat";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String veriGeldi()
	{
		System.out.println(this.name);
		return this.name;
	}
}
