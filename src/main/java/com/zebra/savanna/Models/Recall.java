package com.zebra.savanna.Models;

/**
 * Recall --- Provides public FDA data about nouns like drugs, devices, and
 * foods.
 * 
 * @author SLippert@zebra.com
 * @param <T> The recall's type, either Device or Product
 */
public class Recall<T> {
	private Meta meta;
	private T[] results;

	/**
	 * @return A disclaimer, a link to the openFDA data license, and information
	 *         about the results that follow.
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * @param meta A disclaimer, a link to the openFDA data license, and information
	 *             about the results that follow.
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	/**
	 * @return An array of matching records.
	 */
	public T[] getResults() {
		return results;
	}

	/**
	 * @param results An array of matching records.
	 */
	public void setResults(T[] results) {
		this.results = results;
	}
}