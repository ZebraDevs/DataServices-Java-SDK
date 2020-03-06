package com.zebra.savanna.Models;

/**
 * MetaResults --- Information about the results.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class MetaResults {
	private int skip;
	private int limit;
	private int total;

	/**
	 * @return The offset (page) of results, defined by the skip query parameter.
	 */
	public int getSkip() {
		return skip;
	}

	/**
	 * @param skip The offset (page) of results, defined by the skip query
	 *             parameter.
	 */
	public void setSkip(int skip) {
		this.skip = skip;
	}

	/**
	 * @return The number of records returned, defined by the limit query parameter.
	 *         If there is no limit parameter, the API returns one result.
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param limit The number of records returned, defined by the limit query
	 *              parameter. If there is no limit parameter, the API returns one
	 *              result.
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return The total number of records matching the search criteria.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total The total number of records matching the search criteria.
	 */
	public void setTotal(int total) {
		this.total = total;
	}
}