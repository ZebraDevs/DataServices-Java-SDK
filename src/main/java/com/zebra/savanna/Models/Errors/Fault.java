package com.zebra.savanna.Models.Errors;

/**
 * Fault --- Describes issues encountered while invoking an API.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class Fault {
	private String faultString;
	private Detail detail;

	/**
	 * @return The fault that occurred.
	 */
	public String getFaultString() {
		return faultString;
	}

	/**
	 * @param faultString The fault that occurred.
	 */
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}

	/**
	 * @return Details about the results of the API call.
	 */
	public Detail getDetail() {
		return detail;
	}

	/**
	 * @param detail Details about the results of the API call.
	 */
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
}