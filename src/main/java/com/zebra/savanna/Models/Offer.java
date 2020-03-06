package com.zebra.savanna.Models;

import java.math.BigDecimal;
import java.net.URL;

/**
 * Offer --- Offer for an item provided by a merchant.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class Offer {
	private String merchant;
	private String domain;
	private String title;
	private String currency;
	private String list_price;
	private BigDecimal price;
	private String shipping;
	private String condition;
	private String availability;
	private URL link;
	private long updated_t;

	/**
	 * @return Online store name.
	 */
	public String getMerchant() {
		return merchant;
	}

	/**
	 * @param merchant Online store name.
	 */
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	/**
	 * @return Online store domain.
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain Online store domain.
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return Item name marketed by the merchant.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title Item name marketed by the merchant.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return Currency of ListPrice &amp; Price. Can be "USD", "CAD", "EUR", "GBP",
	 *         "SEK". Default "" means "USD".
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency Currency of ListPrice &amp; Price. Can be "USD", "CAD",
	 *                 "EUR", "GBP", "SEK". Default "" means "USD".
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return Original price from the store.
	 */
	public String getListPrice() {
		return list_price;
	}

	/**
	 * @param listPrice Original price from the store.
	 */
	public void setListPrice(String listPrice) {
		this.list_price = listPrice;
	}

	/**
	 * @return Sale price.
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price Sale price.
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return "Free Shipping" or other shipping information if not free.
	 */
	public String getShipping() {
		return shipping;
	}

	/**
	 * @param shipping "Free Shipping" or other shipping information if not free.
	 */
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	/**
	 * @return "New" or "Used"
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition "New" or "Used"
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @return Default "" means available or "Out of Stock"
	 */
	public String getAvailability() {
		return availability;
	}

	/**
	 * @param availability Default "" means available or "Out of Stock"
	 */
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	/**
	 * @return Shop link of the item.
	 */
	public URL getLink() {
		return link;
	}

	/**
	 * @param link Shop link of the item.
	 */
	public void setLink(URL link) {
		this.link = link;
	}

	/**
	 * @return Unix timestamp of when the offer was last updated.
	 */
	public long getUpdatedTimestamp() {
		return updated_t;
	}

	/**
	 * @param updatedTimestamp Unix timestamp of when the offer was last updated.
	 */
	public void setUpdatedTimestamp(long updatedTimestamp) {
		this.updated_t = updatedTimestamp;
	}
}