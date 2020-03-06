package com.zebra.savanna.Models;

import com.zebra.savanna.IConvertible;

/**
 * Status --- The status of a recall (pending, ongoing, completed, or
 * terminated).
 * 
 * @author SLippert@zebra.com
 * 
 */
public enum Status implements IConvertible {
	/**
	 * A recall which is currently in progress.
	 */
	Ongoing,

	/**
	 * The recall action reaches the point at which the firm has actually retrieved
	 * and impounded all outstanding product that could reasonably be expected to be
	 * recovered, or has completed all product corrections.
	 */
	Completed,

	/**
	 * FDA has determined that all reasonable efforts have been made to remove or
	 * correct the violative product in accordance with the recall strategy, and
	 * proper disposition has been made according to the degree of hazard.
	 */
	Terminated,

	/**
	 * Actions that have been determined to be recalls, but that remain in the
	 * process of being classified.
	 */
	Pending;

	/**
	 * Returns the string representation of this enum constant.
	 * 
	 * @return The name of the enum constant that can be used in a Savanna API
	 */
	public String toValue() {
		return this == Ongoing ? "On-Going" : super.toString();
	}

	/**
	 * Converts a string to a Status.
	 * 
	 * @param status The status string to convert to an enum constant.
	 * @return The enum constant that matches the status.
	 */
	public static Status fromValue(String status) {
		return Status.valueOf(status.replace("-", ""));
	}
}