package com.zebra.savanna;

/**
 * Rotation --- Describes image orientation.
 * 
 * @author SLippert@zebra.com
 *
 */
public enum Rotation implements IConvertible {
	/**
	 * No rotation
	 */
	Normal,
	/**
	 * Clockwise 90 degree rotation
	 */
	Clockwise,
	/**
	 * Inverted 180 degree rotation
	 */
	Inverted,
	/**
	 * Counter-clockwise 90 degree rotation
	 */
	Counterclockwise;

	/**
	 * Returns the string representation of this enum constant.
	 * 
	 * @return The name of the enum constant that can be used in a Savanna API
	 */
	public String toValue() {
		switch (this) {
		case Clockwise:
			return "R";
		case Inverted:
			return "I";
		case Counterclockwise:
			return "L";
		case Normal:
		default:
			return "N";
		}
	}

	/**
	 * Converts a string to a Rotation.
	 * 
	 * @param rotation The rotation string to convert to an enum constant.
	 * @return The enum constant that matches the rotation.
	 */
	public static Rotation fromValue(String rotation) {
		switch (rotation.toCharArray()[0]) {
		case 'R':
			return Clockwise;
		case 'I':
			return Inverted;
		case 'L':
			return Counterclockwise;
		case 'N':
		default:
			return Normal;
		}
	}
}