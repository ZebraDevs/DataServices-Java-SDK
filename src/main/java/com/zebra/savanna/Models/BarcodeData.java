package com.zebra.savanna.Models;

/**
 * BarcodeData --- Response object for UPC lookup
 * 
 * @author SLippert@zebra.com
 *
 */
public class BarcodeData implements IResponse {
	private String code;
	private int total;
	private int offset;
	private Data[] items;

	/**
	 * @return The status code returned by the API.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code The status code returned by the API.
	 */
	public void setCode(String code) {
		this.code = code;
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

	/**
	 * @return The offset (page) of results.
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * @param offset The offset (page) of results.
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * @return The collection of items matching the UPC lookup query.
	 */
	public Data[] getItems() {
		return items;
	}

	/**
	 * @param items The collection of items matching the UPC lookup query.
	 */
	public void setItems(Data[] items) {
		this.items = items;
	}
}