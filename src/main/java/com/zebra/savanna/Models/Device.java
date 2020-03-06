package com.zebra.savanna.Models;

import java.util.Date;

/**
 * Device recall report.
 */
public class Device {
	private Date event_date_terminated;
	private String firm_fei_number;
	private String[] k_numbers;
	private OpenFDADevice openFDA;
	private String other_submission_description;
	private String[] pma_numbers;
	private String product_code;
	private String product_res_number;
	private String res_event_number;
	private String root_cause_description;

	/**
	 * @return Date that FDA determined recall actions were completed and terminated
	 *         the recall. For details about termination of a recall see
	 *         http://www.accessdata.fda.gov/scripts/cdrh/cfdocs/cfcfr/cfrsearch.cfm?fr=7.55
	 */
	public Date getEventDateTerminated() {
		return event_date_terminated;
	}

	/**
	 * @param eventDateTerminated Date that FDA determined recall actions were
	 *                            completed and terminated the recall. For details
	 *                            about termination of a recall see
	 *                            http://www.accessdata.fda.gov/scripts/cdrh/cfdocs/cfcfr/cfrsearch.cfm?fr=7.55
	 */
	public void setEventDateTerminated(Date eventDateTerminated) {
		this.event_date_terminated = eventDateTerminated;
	}

	/**
	 * @return Facility identifier assigned to facility by the FDA Office of
	 *         Regulatory Affairs.
	 */
	public String getFirmFEINumber() {
		return firm_fei_number;
	}

	/**
	 * @param firmFEINumber Facility identifier assigned to facility by the FDA
	 *                      Office of Regulatory Affairs.
	 */
	public void setFirmFEINumber(String firmFEINumber) {
		this.firm_fei_number = firmFEINumber;
	}

	/**
	 * @return FDA-assigned premarket notification number, including leading
	 *         letters. Leading letters "BK" indicates 510(k) clearance, or
	 *         Premarket Notification, cleared by Center for Biologics Evaluation
	 *         and Research. Leading letters "DEN" indicates De Novo, or Evaluation
	 *         of Automatic Class III Designation. Leading letter "K" indicates
	 *         510(k) clearance, or Premarket Notification. `Source`: 510(k)
	 */
	public String[] getKNumbers() {
		return k_numbers;
	}

	/**
	 * @param kNumbers FDA-assigned premarket notification number, including leading
	 *                 letters. Leading letters "BK" indicates 510(k) clearance, or
	 *                 Premarket Notification, cleared by Center for Biologics
	 *                 Evaluation and Research. Leading letters "DEN" indicates De
	 *                 Novo, or Evaluation of Automatic Class III Designation.
	 *                 Leading letter "K" indicates 510(k) clearance, or Premarket
	 *                 Notification. `Source`: 510(k)
	 */
	public void setKNumbers(String[] kNumbers) {
		this.k_numbers = kNumbers;
	}

	/**
	 * @return Information about the recalled medical device.
	 */
	public OpenFDADevice getOpenFDA() {
		return openFDA;
	}

	/**
	 * @param openFDA Information about the recalled medical device.
	 */
	public void setOpenFDA(OpenFDADevice openFDA) {
		this.openFDA = openFDA;
	}

	/**
	 * @return If 510(k) or PMA numbers are not applicable to the device recalled,
	 *         the recall may contain other regulatory descriptions, such as
	 *         `exempt`.
	 */
	public String getOtherSubmissionDescription() {
		return other_submission_description;
	}

	/**
	 * @param otherSubmissionDescription If 510(k) or PMA numbers are not applicable
	 *                                   to the device recalled, the recall may
	 *                                   contain other regulatory descriptions, such
	 *                                   as `exempt`.
	 */
	public void setOtherSubmissionDescription(String otherSubmissionDescription) {
		this.other_submission_description = otherSubmissionDescription;
	}

	/**
	 * @return FDA-assigned premarket application number, including leading letters.
	 *         Leading letter "D" indicates Product Development Protocol type of
	 *         Premarket Approval. Leading letters "BP" indicates Premarket Approval
	 *         by Center for Biologics Evaluation and Research. Leading letter "H"
	 *         indicates Humanitarian Device Exemption approval. Leading letter "N"
	 *         indicates New Drug Application. Early PMAs were approved as NDAs.
	 *         Leading letter "P" indicates Premarket Approval.
	 */
	public String[] getPMANumbers() {
		return pma_numbers;
	}

	/**
	 * @param pmaNumbers FDA-assigned premarket application number, including
	 *                   leading letters. Leading letter "D" indicates Product
	 *                   Development Protocol type of Premarket Approval. Leading
	 *                   letters "BP" indicates Premarket Approval by Center for
	 *                   Biologics Evaluation and Research. Leading letter "H"
	 *                   indicates Humanitarian Device Exemption approval. Leading
	 *                   letter "N" indicates New Drug Application. Early PMAs were
	 *                   approved as NDAs. Leading letter "P" indicates Premarket
	 *                   Approval.
	 */
	public void setPMANumbers(String[] pmaNumbers) {
		this.pma_numbers = pmaNumbers;
	}

	/**
	 * @return A three-letter identifier assigned to a device category. Assignment
	 *         is based upon the medical device classification designated under 21
	 *         CFR Parts 862-892, and the technology and intended use of the device.
	 *         Occasionally these codes are changed over time.
	 */
	public String getProductCode() {
		return product_code;
	}

	/**
	 * @param productCode A three-letter identifier assigned to a device category.
	 *                    Assignment is based upon the medical device classification
	 *                    designated under 21 CFR Parts 862-892, and the technology
	 *                    and intended use of the device. Occasionally these codes
	 *                    are changed over time.
	 */
	public void setProductCode(String productCode) {
		this.product_code = productCode;
	}

	/**
	 * @return The product's number in the Recall Enterprise System.
	 */
	public String getProductResNumber() {
		return product_res_number;
	}

	/**
	 * @param productResNumber The product's number in the Recall Enterprise System.
	 */
	public void setProductResNumber(String productResNumber) {
		this.product_res_number = productResNumber;
	}

	/**
	 * @return A five digit, numerical designation assigned by FDA to a specific
	 *         recall event used for tracking purposes.
	 */
	public String getResEventNumber() {
		return res_event_number;
	}

	/**
	 * @param resEventNumber A five digit, numerical designation assigned by FDA to
	 *                       a specific recall event used for tracking purposes.
	 */
	public void setResEventNumber(String resEventNumber) {
		this.res_event_number = resEventNumber;
	}

	/**
	 * @return FDA determined general type of recall cause. Per FDA policy, recall
	 *         cause determinations are subject to modification up to the point of
	 *         termination of the recall.
	 */
	public String getRootCauseDescription() {
		return root_cause_description;
	}

	/**
	 * @param rootCauseDescription FDA determined general type of recall cause. Per
	 *                             FDA policy, recall cause determinations are
	 *                             subject to modification up to the point of
	 *                             termination of the recall.
	 */
	public void setRootCauseDescription(String rootCauseDescription) {
		this.root_cause_description = rootCauseDescription;
	}
}