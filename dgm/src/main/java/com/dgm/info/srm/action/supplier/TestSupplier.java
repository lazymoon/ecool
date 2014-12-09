package com.dgm.info.srm.action.supplier;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Results({
	@Result(name = "success", location = "/index.jsp"),
	@Result(name = "input", location = "/index.jsp") })
@Controller
public class TestSupplier extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4548943250888300884L;

	@Override
	@Action("spply")
	public String execute() throws Exception {
		System.out.println("aaaa");
		System.out.println("TestSupplier.execute()");
		return SUCCESS;
	}

}
