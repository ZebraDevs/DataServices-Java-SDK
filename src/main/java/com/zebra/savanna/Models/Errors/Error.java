package com.zebra.savanna.Models.Errors;

import java.net.URL;

import com.zebra.savanna.Models.IResponse;

/**
 * Error --- Thrown when a Savanna API call does not succeed.
 * 
 * @author SLippert@zebra.com
 * 
 */
public abstract class Error extends Exception implements IResponse {
	private static final long serialVersionUID = -4525518907995190495L;

	/**
	 * Initializes a new instance of the Error class.
	 */
	public Error() {
	}

	/**
	 * Initializes a new instance of the StringError class with a specified error
	 * message.
	 * 
	 * @param message The message that describes the error.
	 */
	public Error(String message) {
		super(message);
	}

	/**
	 * Initializes a new instance of the StringError class with a specified error
	 * message and a reference to the inner exception that is the cause of this
	 * exception.
	 * 
	 * @param cause The exception that is the cause of the current exception, or a
	 *              null reference if no inner exception is specified.
	 */
	public Error(Throwable cause) {
		super(cause);
	}

	/**
	 * Initializes a new instance of the StringError class with a specified error
	 * message and a reference to the inner exception that is the cause of this
	 * exception.
	 * 
	 * @param message The error message that explains the reason for the exception.
	 * @param cause   The exception that is the cause of the current exception, or a
	 *                null reference if no inner exception is specified.
	 */
	public Error(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @return The status code returned by the API.
	 */
	public abstract String getCode();

	/**
	 * @param code The status code returned by the API.
	 */
	public abstract void setCode(String code);

	/**
	 * @return Link to a web page providing more information about result of the API
	 *         call.
	 */
	public abstract URL getInfo();

	/**
	 * @param info Link to a web page providing more information about result of the
	 *             API call.
	 */
	public abstract void setInfo(URL info);

	/**
	 * @return Details about the error encountered while making the API call.
	 */
	public abstract String getErrorDetail();

	/**
	 * @param errorDetail Details about the error encountered while making the API
	 *                    call.
	 */
	public abstract void setErrorDetail(String errorDetail);
	
	/**
	 * @return The formatted error message.
	 */
	public abstract String getMessageFormatted();
}