package com.zebra.savanna;

/**
 * IConvertible --- Interface to describe an enum with backing strings
 * 
 * 
 * @author SLippert@zebra.com
 */
public interface IConvertible {

	/**
	 * Returns the string representation of this enum constant.
	 * 
	 * @return The name of the enum constant that can be used in a Savanna API
	 */
	String toValue();
}