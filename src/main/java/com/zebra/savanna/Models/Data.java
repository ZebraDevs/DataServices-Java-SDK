package com.zebra.savanna.Models;

import java.net.URL;

/**
 * Data --- Item matching a UPC lookup query
 * 
 * @author SLippert@zebra.com
 * 
 */
public class Data {
	private String ean;
	private String title;
	private String description;
	private URL[] images;
	private Offer[] offers;
	private String asin;
	private String isbn;
	private String publisher;
	private String upc;
	private String brand;
	private String model;
	private String color;
	private String size;
	private String dimension;
	private String weight;
	private String currency;
	private String lowest_recorded_price;
	private String highest_recorded_price;
	private String elid;

	/**
	 * @return EAN-13, 13-digit European Article Number (aka. GTIN-13). This is the
	 *         unique number we used to identify each item in our database. If it
	 *         starts with 0, the rest 12-digit is the UPC (aka. UPC-A, GTIN-12),
	 *         ex. 0885909456017.
	 */
	public String getEAN() {
		return ean;
	}

	/**
	 * @param ean EAN-13, 13-digit European Article Number (aka. GTIN-13). This is
	 *            the unique number we used to identify each item in our database.
	 *            If it starts with 0, the rest 12-digit is the UPC (aka. UPC-A,
	 *            GTIN-12), ex. 0885909456017.
	 */
	public void setEAN(String ean) {
		this.ean = ean;
	}

	/**
	 * @return Item title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title Item title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return Item description with length &lt; 515.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description Item description with length &lt; 515.
	 */
	public void setDescription(String description) {
		if (description.length() >= 515) {
			throw new IllegalArgumentException("Description field too long.");
		}
		this.description = description;
	}

	/**
	 * @return Collection of image urls.
	 */
	public URL[] getImages() {
		return images;
	}

	/**
	 * @param images Collection of image urls.
	 */
	public void setImages(URL[] images) {
		this.images = images;
	}

	/**
	 * @return Offers for item provided by merchants.
	 */
	public Offer[] getOffers() {
		return offers;
	}

	/**
	 * @param offers Offers for item provided by merchants.
	 */
	public void setOffers(Offer[] offers) {
		this.offers = offers;
	}

	/**
	 * @return Amazon Standard Identification Number (ASIN) is a 10-character
	 *         alphanumeric unique identifier assigned by Amazon.com and its
	 *         partners for product identification within the Amazon organization.
	 */
	public String getASIN() {
		return asin;
	}

	/**
	 * @param asin Amazon Standard Identification Number (ASIN) is a 10-character
	 *             alphanumeric unique identifier assigned by Amazon.com and its
	 *             partners for product identification within the Amazon
	 *             organization.
	 */
	public void setASIN(String asin) {
		this.asin = asin;
	}

	/**
	 * @return International Standard Book Numbers (ISBN) are numeric commercial
	 *         book identifiers which are intended to be unique. An ISBN is assigned
	 *         to each separate edition and variation (except reprintings) of a
	 *         publication.
	 */
	public String getISBN() {
		return isbn;
	}

	/**
	 * @param isbn International Standard Book Numbers (ISBN) are numeric commercial
	 *             book identifiers which are intended to be unique. An ISBN is
	 *             assigned to each separate edition and variation (except
	 *             reprintings) of a publication.
	 */
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return Publisher name
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher Publisher name
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return UPC-A, 12-digit Universal Product Code (aka. GTIN-12). If item’s EAN
	 *         does not start with 0, there is no corresponding UPC-A code, ex.
	 *         6009705662678.
	 */
	public String getUPC() {
		return upc;
	}

	/**
	 * @param upc UPC-A, 12-digit Universal Product Code (aka. GTIN-12). If item’s
	 *            EAN does not start with 0, there is no corresponding UPC-A code,
	 *            ex. 6009705662678.
	 */
	public void setUPC(String upc) {
		this.upc = upc;
	}

	/**
	 * @return Brand name or manufacturer name with length &lt; 64.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand Brand name or manufacturer name with length &lt; 64.
	 */
	public void setBrand(String brand) {
		if (brand.length() >= 64) {
			throw new IllegalArgumentException("Brand field too long.");
		}
		this.brand = brand;
	}

	/**
	 * @return Item model number with length &lt; 32.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model Item model number with length &lt; 32.
	 */
	public void setModel(String model) {
		if (model.length() >= 32) {
			throw new IllegalArgumentException("Model field too long.");
		}
		this.model = model;
	}

	/**
	 * @return Item color with length &lt; 32, ex. for clothing, shoes.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color Item color with length &lt; 32, ex. for clothing, shoes.
	 */
	public void setColor(String color) {
		if (color.length() >= 32) {
			throw new IllegalArgumentException("Color field too long.");
		}
		this.color = color;
	}

	/**
	 * @return Item size with length &lt; 32, ex. for clothing, shoes.
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size Item size with length &lt; 32, ex. for clothing, shoes.
	 */
	public void setSize(String size) {
		if (size.length() >= 32) {
			throw new IllegalArgumentException("Size field too long.");
		}
		this.size = size;
	}

	/**
	 * @return Item dimension measurements.
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @param dimension Item dimension measurements.
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return Item weight with length &lt; 16.
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight Item weight with length &lt; 16.
	 */
	public void setWeight(String weight) {
		if (weight.length() >= 16) {
			throw new IllegalArgumentException("Weight field too long.");
		}
		this.weight = weight;
	}

	/**
	 * @return Currency of the LowestRecordedPrice. Can be "USD", "CAD", "EUR",
	 *         "GBP", "SEK". Default "" means "USD".
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency Currency of the LowestRecordedPrice. Can be "USD", "CAD",
	 *                 "EUR", "GBP", "SEK". Default "" means "USD".
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return Lowest historical price of the item since tracked by our system. Not
	 *         available for books.
	 */
	public String getLowestRecordedPrice() {
		return lowest_recorded_price;
	}

	/**
	 * @param lowestRecordedPrice Lowest historical price of the item since tracked
	 *                            by our system. Not available for books.
	 */
	public void setLowestRecordedPrice(String lowestRecordedPrice) {
		this.lowest_recorded_price = lowestRecordedPrice;
	}

	/**
	 * @return Highest historical price of the item since tracked by our system. Not
	 *         available for books.
	 */
	public String getHighestRecordedPrice() {
		return highest_recorded_price;
	}

	/**
	 * @param highestRecordedPrice Highest historical price of the item since
	 *                             tracked by our system. Not available for books.
	 */
	public void setHighestRecordedPrice(String highestRecordedPrice) {
		this.highest_recorded_price = highestRecordedPrice;
	}

	/**
	 * @return eBay Listing ID, aka. item ID or item number. Item ID is 9 to 12
	 *         digits in length. If item is found on eBay.com, you can simply locate
	 *         the item by http://www.ebay.com/itm/[eLID].
	 */
	public String getELID() {
		return elid;
	}

	/**
	 * @param elid eBay Listing ID, aka. item ID or item number. Item ID is 9 to 12
	 *             digits in length. If item is found on eBay.com, you can simply
	 *             locate the item by http://www.ebay.com/itm/[eLID].
	 */
	public void setELID(String elid) {
		this.elid = elid;
	}
}