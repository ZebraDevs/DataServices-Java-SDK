package com.zebra.savanna.Models.Errors;

/**
 * DeveloperMessage --- Provides information about the results of an API call.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class DeveloperMessage {
	private Fault fault;

	/**
	 * @return Issues encountered while invoking the API.
	 */
	public Fault getFault() {
		return fault;
	}

	/**
	 * @param fault Issues encountered while invoking the API.
	 */
	public void setFault(Fault fault) {
		this.fault = fault;
	}
}