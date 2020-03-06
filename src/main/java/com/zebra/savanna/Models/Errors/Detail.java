package com.zebra.savanna.Models.Errors;

/**
 * Detail --- Provides details about the results of an API call.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class Detail {
	private String errorCode;

	/**
	 * @return The error code encountered while invoking the API.
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode The error code encountered while invoking the API.
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}