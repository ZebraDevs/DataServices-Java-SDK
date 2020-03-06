package com.zebra.savanna.Models;

import com.zebra.savanna.IConvertible;

/**
 * A risk based classification system for all medical devices ((Federal Food,
 * Drug, and Cosmetic Act, section 513)
 */
public enum DeviceClass implements IConvertible {
	/**
	 * Class I (low to moderate risk): general controls
	 */
	Class1,
	/**
	 * Class II (moderate to high risk): general controls and special controls
	 */
	Class2,
	/**
	 * Class III (high risk): general controls and Premarket Approval (PMA)
	 */
	Class3,
	/**
	 * Unclassified
	 */
	U,
	/**
	 * Not classified
	 */
	N,
	/**
	 * HDE
	 */
	F;

	/**
	 * Returns the string representation of this enum constant.
	 * 
	 * @return The name of the enum constant that can be used in a Savanna API
	 */
	public String toValue() {
		String retval = super.toString();
		return retval.substring(retval.length() - 1);
	}

	/**
	 * Converts a string to a DeviceClass.
	 * 
	 * @param deviceClass The device class string to convert to an enum constant.
	 * @return The enum constant that matches the device class.
	 */
	public static DeviceClass fromValue(String deviceClass) {
		switch (deviceClass.toCharArray()[deviceClass.length() - 1]) {
		case '1':
			return Class1;
		case '2':
			return Class2;
		case '3':
			return Class3;
		}
		return DeviceClass.valueOf(deviceClass);
	}
}