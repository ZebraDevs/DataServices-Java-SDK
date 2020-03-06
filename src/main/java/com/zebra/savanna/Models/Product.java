package com.zebra.savanna.Models;

import java.util.Date;

/**
 * Product --- Product recall report.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class Product {
	private String address_1;
	private String address_2;
	private Date center_classification_date;
	private String city;
	private Classification classification;
	private String code_info;
	private String country;
	private String distribution_pattern;
	private String event_id;
	private String initial_firm_notification;
	private String more_code_info;
	private OpenFDAProduct openFDA;
	private String postal_code;
	private String product_code;
	private String product_description;
	private String product_quantity;
	private ProductType product_type;
	private String reason_for_recall;
	private Date recall_initiation_date;
	private String recall_number;
	private String recalling_firm;
	private Date report_date;
	private String state;
	private Status status;
	private Date termination_date;
	private String voluntary_mandated;

	/**
	 * @return The first address line of the recalling firm.
	 */
	public String getAddress1() {
		return address_1;
	}

	/**
	 * @param address1 The first address line of the recalling firm.
	 */
	public void setAddress1(String address1) {
		this.address_1 = address1;
	}

	/**
	 * @return The second address line of the recalling firm.
	 */
	public String getAddress2() {
		return address_2;
	}

	/**
	 * @param address2 The second address line of the recalling firm.
	 */
	public void setAddress2(String address2) {
		this.address_2 = address2;
	}

	/**
	 * @return The date that FDA classified the recalled products as Class I, II, or
	 *         III.
	 */
	public Date getCenterClassificationDate() {
		return center_classification_date;
	}

	/**
	 * @param centerClassificationDate The date that FDA classified the recalled
	 *                                 products as Class I, II, or III.
	 */
	public void setCenterClassificationDate(Date centerClassificationDate) {
		this.center_classification_date = centerClassificationDate;
	}

	/**
	 * @return The city in which the recalling firm is located.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city The city in which the recalling firm is located.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return Numerical designation (I, II, or III) that is assigned by FDA to a
	 *         particular product recall that indicates the relative degree of
	 *         health hazard.
	 */
	public Classification getClassification() {
		return classification;
	}

	/**
	 * @param classification Numerical designation (I, II, or III) that is assigned
	 *                       by FDA to a particular product recall that indicates
	 *                       the relative degree of health hazard.s
	 */
	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	/**
	 * @return A list of all lot and/or serial numbers, product numbers, packer or
	 *         manufacturer numbers, sell or use by dates, etc., which appear on the
	 *         product or its labeling.
	 */
	public String getCodeInfo() {
		return code_info;
	}

	/**
	 * @param codeInfo A list of all lot and/or serial numbers, product numbers,
	 *                 packer or manufacturer numbers, sell or use by dates, etc.,
	 *                 which appear on the product or its labeling.
	 */
	public void setCodeInfo(String codeInfo) {
		this.code_info = codeInfo;
	}

	/**
	 * @return The country in which the recalling firm is located.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country The country in which the recalling firm is located.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return General area of initial distribution such as, "Distributors in 6
	 *         states: NY, VA, TX, GA, FL and MA; the Virgin Islands; Canada and
	 *         Japan". The term "nationwide" is defined to mean the fifty states or
	 *         a significant portion. Note that subsequent distribution by the
	 *         consignees to other parties may not be included.
	 */
	public String getDistributionPattern() {
		return distribution_pattern;
	}

	/**
	 * @param distributionPattern General area of initial distribution such as,
	 *                            "Distributors in 6 states: NY, VA, TX, GA, FL and
	 *                            MA; the Virgin Islands; Canada and Japan". The
	 *                            term "nationwide" is defined to mean the fifty
	 *                            states or a significant portion. Note that
	 *                            subsequent distribution by the consignees to other
	 *                            parties may not be included.
	 */
	public void setDistributionPattern(String distributionPattern) {
		this.distribution_pattern = distributionPattern;
	}

	/**
	 * @return A numerical designation assigned by FDA to a specific recall event
	 *         used for tracking purposes.
	 */
	public String getEventID() {
		return event_id;
	}

	/**
	 * @param eventID A numerical designation assigned by FDA to a specific recall
	 *                event used for tracking purposes.
	 */
	public void setEventID(String eventID) {
		this.event_id = eventID;
	}

	/**
	 * @return The method(s) by which the firm initially notified the public or
	 *         their consignees of a recall. A consignee is a person or firm named
	 *         in a bill of lading to whom or to whose order the product has or will
	 *         be delivered.
	 */
	public String getInitialFirmNotification() {
		return initial_firm_notification;
	}

	/**
	 * @param initialFirmNotification The method(s) by which the firm initially
	 *                                notified the public or their consignees of a
	 *                                recall. A consignee is a person or firm named
	 *                                in a bill of lading to whom or to whose order
	 *                                the product has or will be delivered.
	 */
	public void setInitialFirmNotification(String initialFirmNotification) {
		this.initial_firm_notification = initialFirmNotification;
	}

	/**
	 * @return A list of additional lot and/or serial numbers, product numbers,
	 *         expiration dates, sell or use by dates, etc., which appear on the
	 *         product or its labeling.
	 */
	public String getMoreCodeInfo() {
		return more_code_info;
	}

	/**
	 * @param moreCodeInfo A list of additional lot and/or serial numbers, product
	 *                     numbers, expiration dates, sell or use by dates, etc.,
	 *                     which appear on the product or its labeling.
	 */
	public void setMoreCodeInfo(String moreCodeInfo) {
		this.more_code_info = moreCodeInfo;
	}

	/**
	 * @return Information about the recalled product.
	 */
	public OpenFDAProduct getOpenFDA() {
		return openFDA;
	}

	/**
	 * @param openFDA Information about the recalled product.
	 */
	public void setOpenFDA(OpenFDAProduct openFDA) {
		this.openFDA = openFDA;
	}

	/**
	 * @return The postal code in which the recalling firm is located.
	 */
	public String getPostalCode() {
		return postal_code;
	}

	/**
	 * @param postalCode The postal code in which the recalling firm is located.
	 */
	public void setPostalCode(String postalCode) {
		this.postal_code = postalCode;
	}

	/**
	 * @return A three-letter identifier assigned to a product category. Assignment
	 *         is based upon the product classification designated under 21 CFR
	 *         Parts 862-892, and the technology and intended use of the product.
	 *         Occasionally these codes are changed over time.
	 */
	public String getProductCode() {
		return product_code;
	}

	/**
	 * @param productCode A three-letter identifier assigned to a product category.
	 *                    Assignment is based upon the product classification
	 *                    designated under 21 CFR Parts 862-892, and the technology
	 *                    and intended use of the product. Occasionally these codes
	 *                    are changed over time.
	 */
	public void setProductCode(String productCode) {
		this.product_code = productCode;
	}

	/**
	 * @return Brief description of the product being recalled.
	 */
	public String getProductDescription() {
		return product_description;
	}

	/**
	 * @param productDescription Brief description of the product being recalled.
	 */
	public void setProductDescription(String productDescription) {
		this.product_description = productDescription;
	}

	/**
	 * @return The amount of defective product subject to recall.
	 */
	public String getProductQuantity() {
		return product_quantity;
	}

	/**
	 * @param productQuantity The amount of defective product subject to recall.
	 */
	public void setProductQuantity(String productQuantity) {
		this.product_quantity = productQuantity;
	}

	/**
	 * @return the The type of product being recalled. For drug queries, this will
	 *         always be `Drugs`.
	 */
	public ProductType getProductType() {
		return product_type;
	}

	/**
	 * @param productType The type of product being recalled. For drug queries, this
	 *                    will always be `Drugs`.
	 */
	public void setProductType(ProductType productType) {
		this.product_type = productType;
	}

	/**
	 * @return Information describing how the product is defective and violates the
	 *         FD&amp;C Act or related statutes.
	 */
	public String getReasonForRecall() {
		return reason_for_recall;
	}

	/**
	 * @param reasonForRecall Information describing how the product is defective
	 *                        and violates the FD&amp;C Act or related statutes.
	 */
	public void setReasonForRecall(String reasonForRecall) {
		this.reason_for_recall = reasonForRecall;
	}

	/**
	 * @return Date that the firm first began notifying the public or their
	 *         consignees of the recall.
	 */
	public Date getRecallInitiationDate() {
		return recall_initiation_date;
	}

	/**
	 * @param recallInitiationDate Date that the firm first began notifying the
	 *                             public or their consignees of the recall.
	 */
	public void setRecallInitiationDate(Date recallInitiationDate) {
		this.recall_initiation_date = recallInitiationDate;
	}

	/**
	 * @return A numerical designation assigned by FDA to a specific recall event
	 *         used for tracking purposes.
	 */
	public String getRecallNumber() {
		return recall_number;
	}

	/**
	 * @param recallNumber A numerical designation assigned by FDA to a specific
	 *                     recall event used for tracking purposes.
	 */
	public void setRecallNumber(String recallNumber) {
		this.recall_number = recallNumber;
	}

	/**
	 * @return The firm that initiates a recall or, in the case of an FDA requested
	 *         recall or FDA mandated recall, the firm that has primary
	 *         responsibility for the manufacture and (or) marketing of the product
	 *         to be recalled.
	 */
	public String getRecallingFirm() {
		return recalling_firm;
	}

	/**
	 * @param recallingFirm The firm that initiates a recall or, in the case of an
	 *                      FDA requested recall or FDA mandated recall, the firm
	 *                      that has primary responsibility for the manufacture and
	 *                      (or) marketing of the product to be recalled.
	 */
	public void setRecallingFirm(String recallingFirm) {
		this.recalling_firm = recallingFirm;
	}

	/**
	 * @return Date that the FDA issued the enforcement report for the product
	 *         recall.
	 */
	public Date getReportDate() {
		return report_date;
	}

	/**
	 * @param reportDate Date that the FDA issued the enforcement report for the
	 *                   product recall.
	 */
	public void setReportDate(Date reportDate) {
		this.report_date = reportDate;
	}

	/**
	 * @return The U.S. state in which the recalling firm is located.
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state The U.S. state in which the recalling firm is located.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return The status of a recall (pending, ongoing, completed, or terminated).
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status The status of a recall (pending, ongoing, completed, or
	 *               terminated).
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return Date that the FDA terminated the enforcement report for the product
	 *         recall.
	 */
	public Date getTerminationDate() {
		return termination_date;
	}

	/**
	 * @param terminationDate Date that the FDA terminated the enforcement report
	 *                        for the product recall.
	 */
	public void setTerminationDate(Date terminationDate) {
		this.termination_date = terminationDate;
	}

	/**
	 * @return Describes who initiated the recall. Recalls are almost always
	 *         voluntary, meaning initiated by a firm. A recall is deemed voluntary
	 *         when the firm voluntarily removes or corrects marketed products or
	 *         the FDA requests the marketed products be removed or corrected. A
	 *         recall is mandated when the firm was ordered by the FDA to remove or
	 *         correct the marketed products, under section 518(e) of the FD&amp;C
	 *         Act, National Childhood Vaccine Injury Act of 1986, 21 CFR 1271.440,
	 *         Infant Formula Act of 1980 and its 1986 amendments, or the Food
	 *         Safety Modernization Act (FSMA).
	 */
	public String getVoluntaryMandated() {
		return voluntary_mandated;
	}

	/**
	 * @param voluntaryMandated Describes who initiated the recall. Recalls are
	 *                          almost always voluntary, meaning initiated by a
	 *                          firm. A recall is deemed voluntary when the firm
	 *                          voluntarily removes or corrects marketed products or
	 *                          the FDA requests the marketed products be removed or
	 *                          corrected. A recall is mandated when the firm was
	 *                          ordered by the FDA to remove or correct the marketed
	 *                          products, under section 518(e) of the FD&amp;C Act,
	 *                          National Childhood Vaccine Injury Act of 1986, 21
	 *                          CFR 1271.440, Infant Formula Act of 1980 and its
	 *                          1986 amendments, or the Food Safety Modernization
	 *                          Act (FSMA).
	 */
	public void setVoluntaryMandated(String voluntaryMandated) {
		this.voluntary_mandated = voluntaryMandated;
	}
}