/**
 * 
 */
package com.prft.microservices.consumer.model;

/**
 * @author mounika.pandiri
 *
 */
public class Client {

	private String company;
	private String name;
	private String email;
	private String phone;
	private String status;

	public Client(String name, String status) {
		this.name = name;
		this.status = status;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
