package com.zebra.savanna.Models;

/**
 * IResponse --- The result of an API call.
 *
 * @author SLippert@zebra.com
 *
 */
public interface IResponse {
	/**
	 * @return The status code returned by the API.
	 */
	String getCode();

	/**
	 * @param code The status code returned by the API.
	 */
	void setCode(String code);
}