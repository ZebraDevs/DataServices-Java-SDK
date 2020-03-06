package com.zebra.savanna.Models;

import com.zebra.savanna.IConvertible;

/**
 * Numerical designation (I, II, or III) that is assigned by FDA to a particular
 * product recall that indicates the relative degree of health hazard.
 */
public enum Classification implements IConvertible {
	/**
	 * Dangerous or defective products that predictably could cause serious health
	 * problems or death. Examples include: food found to contain botulinum toxin,
	 * food with undeclared allergens, a label mix-up on a lifesaving drug, or a
	 * defective artificial heart valve.
	 */
	ClassI,

	/**
	 * Products that might cause a temporary health problem, or pose only a slight
	 * threat of a serious nature. Example: a drug that is under-strength but that
	 * is not used to treat life-threatening situations.
	 */
	ClassII,

	/**
	 * Products that are unlikely to cause any adverse health reaction, but that
	 * violate FDA labeling or manufacturing laws. Examples include: a minor
	 * container defect and lack of English labeling in a retail food.
	 */
	ClassIII;

	/**
	 * Returns the string representation of this enum constant.
	 * 
	 * @return The name of the enum constant that can be used in a Savanna API
	 */
	public String toValue() {
		return "Class " + toString().substring(5);
	}

	/**
	 * Converts a string to a Classification.
	 * 
	 * @param classification The classification string to convert to an enum
	 *                       constant.
	 * @return The enum constant that matches the classification.
	 */
	public static Classification fromValue(String classification) {
		return Classification.valueOf(classification.replace(" ", ""));
	}
}