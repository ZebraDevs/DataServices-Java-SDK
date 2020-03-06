package com.zebra.savanna.Models;

/**
 * OpenFDAProduct --- Information about a recalled food or drug.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class OpenFDAProduct {
	private String[] application_number;
	private String[] brand_name;
	private String[] generic_name;
	private boolean is_original_packager;
	private String[] manufacturer_name;
	private String[] nui;
	private String[] original_packager_product_ndc;
	private String[] package_ndc;
	private String[] pharm_class_cs;
	private String[] pharm_class_epc;
	private String[] pharm_class_pe;
	private String[] pharm_class_moa;
	private String[] product_ndc;
	private String[] product_type;
	private String[] route;
	private String[] rxcui;
	private String[] spl_id;
	private String[] spl_set_id;
	private String[] substance_name;
	private String[] unii;
	private String[] upc;

	/**
	 * @return This corresponds to the NDA, ANDA, or BLA number reported by the
	 *         labeler for products which have the corresponding Marketing Category
	 *         designated. If the designated Marketing Category is OTC Monograph
	 *         Final or OTC Monograph Not Final, then the application number will be
	 *         the CFR citation corresponding to the appropriate Monograph (e.g.
	 *         "part 341"). For unapproved drugs, this field will be null.
	 */
	public String[] getApplicationNumber() {
		return application_number;
	}

	/**
	 * @param applicationNumber This corresponds to the NDA, ANDA, or BLA number
	 *                          reported by the labeler for products which have the
	 *                          corresponding Marketing Category designated. If the
	 *                          designated Marketing Category is OTC Monograph Final
	 *                          or OTC Monograph Not Final, then the application
	 *                          number will be the CFR citation corresponding to the
	 *                          appropriate Monograph (e.g. "part 341"). For
	 *                          unapproved drugs, this field will be null.
	 */
	public void setApplicationNumber(String[] applicationNumber) {
		this.application_number = applicationNumber;
	}

	/**
	 * @return Brand or trade name of the drug product.
	 */
	public String[] getBrandName() {
		return brand_name;
	}

	/**
	 * @param brandName Brand or trade name of the drug product.
	 */
	public void setBrandName(String[] brandName) {
		this.brand_name = brandName;
	}

	/**
	 * @return Generic name(s) of the drug product.
	 */
	public String[] getGenericName() {
		return generic_name;
	}

	/**
	 * @param genericName Generic name(s) of the drug product.
	 */
	public void setGenericName(String[] genericName) {
		this.generic_name = genericName;
	}

	/**
	 * @return Whether or not the drug has been repackaged for distribution.
	 */
	public boolean isIsOriginalPackager() {
		return is_original_packager;
	}

	/**
	 * @param isOriginalPackager Whether or not the drug has been repackaged for
	 *                           distribution.
	 */
	public void setIsOriginalPackager(boolean isOriginalPackager) {
		this.is_original_packager = isOriginalPackager;
	}

	/**
	 * @return Name of manufacturer or company that makes this drug product,
	 *         corresponding to the labeler code segment of the NDC.
	 */
	public String[] getManufacturerName() {
		return manufacturer_name;
	}

	/**
	 * @param manufacturerName Name of manufacturer or company that makes this drug
	 *                         product, corresponding to the labeler code segment of
	 *                         the NDC.
	 */
	public void setManufacturerName(String[] manufacturerName) {
		this.manufacturer_name = manufacturerName;
	}

	/**
	 * @return Unique identifier applied to a drug concept within the National Drug
	 *         File Reference Terminology (NDF-RT).
	 *         https://www.nlm.nih.gov/research/umls/sourcereleasedocs/current/NDFRT/
	 */
	public String[] getNUI() {
		return nui;
	}

	/**
	 * @param nui Unique identifier applied to a drug concept within the National
	 *            Drug File Reference Terminology (NDF-RT).
	 *            https://www.nlm.nih.gov/research/umls/sourcereleasedocs/current/NDFRT/
	 */
	public void setNUI(String[] nui) {
		this.nui = nui;
	}

	/**
	 * @return This NDC identifies the original packager.
	 */
	public String[] getOriginalPackagerProductNDC() {
		return original_packager_product_ndc;
	}

	/**
	 * @param originalPackagerProductNDC This NDC identifies the original packager.
	 */
	public void setOriginalPackagerProductNDC(String[] originalPackagerProductNDC) {
		this.original_packager_product_ndc = originalPackagerProductNDC;
	}

	/**
	 * @return This number, known as the NDC, identifies the labeler, product, and
	 *         trade package size. The first segment, the labeler code, is assigned
	 *         by the FDA. A labeler is any firm that manufactures (including
	 *         repackers or relabelers), or distributes (under its own name) the
	 *         drug.
	 */
	public String[] getPackageNDC() {
		return package_ndc;
	}

	/**
	 * @param packageNDC This number, known as the NDC, identifies the labeler,
	 *                   product, and trade package size. The first segment, the
	 *                   labeler code, is assigned by the FDA. A labeler is any firm
	 *                   that manufactures (including repackers or relabelers), or
	 *                   distributes (under its own name) the drug.
	 */
	public void setPackageNDC(String[] packageNDC) {
		this.package_ndc = packageNDC;
	}

	/**
	 * @return Chemical structure classification of the drug product’s pharmacologic
	 *         class. Takes the form of the classification, followed by
	 *         `[Chemical/Ingredient]` (such as `Thiazides [Chemical/Ingredient]` or
	 *         `Antibodies, Monoclonal [Chemical/Ingredient].
	 */
	public String[] getPharmClassCS() {
		return pharm_class_cs;
	}

	/**
	 * @param pharmClassCS Chemical structure classification of the drug product’s
	 *                     pharmacologic class. Takes the form of the
	 *                     classification, followed by `[Chemical/Ingredient]` (such
	 *                     as `Thiazides [Chemical/Ingredient]` or `Antibodies,
	 *                     Monoclonal [Chemical/Ingredient].
	 */
	public void setPharmClassCS(String[] pharmClassCS) {
		this.pharm_class_cs = pharmClassCS;
	}

	/**
	 * @return Established pharmacologic class associated with an approved
	 *         indication of an active moiety (generic drug) that the FDA has
	 *         determined to be scientifically valid and clinically meaningful.
	 *         Takes the form of the pharmacologic class, followed by `[EPC]` (such
	 *         as `Thiazide Diuretic [EPC]` or `Tumor Necrosis Factor Blocker
	 *         [EPC]`.
	 */
	public String[] getPharmClassEPC() {
		return pharm_class_epc;
	}

	/**
	 * @param pharmClassEPC Established pharmacologic class associated with an
	 *                      approved indication of an active moiety (generic drug)
	 *                      that the FDA has determined to be scientifically valid
	 *                      and clinically meaningful. Takes the form of the
	 *                      pharmacologic class, followed by `[EPC]` (such as
	 *                      `Thiazide Diuretic [EPC]` or `Tumor Necrosis Factor
	 *                      Blocker [EPC]`.
	 */
	public void setPharmClassEPC(String[] pharmClassEPC) {
		this.pharm_class_epc = pharmClassEPC;
	}

	/**
	 * @return Physiologic effect or pharmacodynamic effect—tissue, organ, or organ
	 *         system level functional activity of the drug’s established
	 *         pharmacologic class. Takes the form of the effect, followed by `[PE]`
	 *         (such as `Increased Diuresis [PE]` or `Decreased Cytokine Activity
	 *         [PE]`.
	 */
	public String[] getPharmClassPE() {
		return pharm_class_pe;
	}

	/**
	 * @param pharmClassPE Physiologic effect or pharmacodynamic effect—tissue,
	 *                     organ, or organ system level functional activity of the
	 *                     drug’s established pharmacologic class. Takes the form of
	 *                     the effect, followed by `[PE]` (such as `Increased
	 *                     Diuresis [PE]` or `Decreased Cytokine Activity [PE]`.
	 */
	public void setPharmClassPE(String[] pharmClassPE) {
		this.pharm_class_pe = pharmClassPE;
	}

	/**
	 * @return Mechanism of action of the drug—molecular, subcellular, or cellular
	 *         functional activity—of the drug’s established pharmacologic class.
	 *         Takes the form of the mechanism of action, followed by `[MoA]` (such
	 *         as `Calcium Channel Antagonists [MoA]` or `Tumor Necrosis Factor
	 *         Receptor Blocking Activity [MoA]`.
	 */
	public String[] getPharm_class_moa() {
		return pharm_class_moa;
	}

	/**
	 * @param pharm_class_moa Mechanism of action of the drug—molecular,
	 *                        subcellular, or cellular functional activity—of the
	 *                        drug’s established pharmacologic class. Takes the form
	 *                        of the mechanism of action, followed by `[MoA]` (such
	 *                        as `Calcium Channel Antagonists [MoA]` or `Tumor
	 *                        Necrosis Factor Receptor Blocking Activity [MoA]`.
	 */
	public void setPharm_class_moa(String[] pharm_class_moa) {
		this.pharm_class_moa = pharm_class_moa;
	}

	/**
	 * @return The labeler manufacturer code and product code segments of the NDC
	 *         number, separated by a hyphen.
	 */
	public String[] getProductNDC() {
		return product_ndc;
	}

	/**
	 * @param productNDC The labeler manufacturer code and product code segments of
	 *                   the NDC number, separated by a hyphen.
	 */
	public void setProductNDC(String[] productNDC) {
		this.product_ndc = productNDC;
	}

	/**
	 * @return Type of drug product.
	 *         http://www.fda.gov/ForIndustry/DataStandards/StructuredProductLabeling/ucm162063.htm
	 */
	public String[] getProductType() {
		return product_type;
	}

	/**
	 * @param productType Type of drug product.
	 *                    http://www.fda.gov/ForIndustry/DataStandards/StructuredProductLabeling/ucm162063.htm
	 */
	public void setProductType(String[] productType) {
		this.product_type = productType;
	}

	/**
	 * @return The route of administration of the drug product.
	 *         http://www.fda.gov/ForIndustry/DataStandards/StructuredProductLabeling/ucm162034.htm
	 */
	public String[] getRoute() {
		return route;
	}

	/**
	 * @param route The route of administration of the drug product.
	 *              http://www.fda.gov/ForIndustry/DataStandards/StructuredProductLabeling/ucm162034.htm
	 */
	public void setRoute(String[] route) {
		this.route = route;
	}

	/**
	 * @return The RxNorm Concept Unique Identifier. RxCUI is a unique number that
	 *         describes a semantic concept about the drug product, including its
	 *         ingredients, strength, and dose forms.
	 *         https://www.nlm.nih.gov/research/umls/rxnorm/docs/2012/rxnorm_doco_full_2012-3.html
	 */
	public String[] getRxCUI() {
		return rxcui;
	}

	/**
	 * @param rxCUI The RxNorm Concept Unique Identifier. RxCUI is a unique number
	 *              that describes a semantic concept about the drug product,
	 *              including its ingredients, strength, and dose forms.
	 *              https://www.nlm.nih.gov/research/umls/rxnorm/docs/2012/rxnorm_doco_full_2012-3.html
	 */
	public void setRxCUI(String[] rxCUI) {
		this.rxcui = rxCUI;
	}

	/**
	 * @return Unique identifier for a particular version of a Structured Product
	 *         Label for a product. Also referred to as the document ID.
	 */
	public String[] getSPLId() {
		return spl_id;
	}

	/**
	 * @param splId Unique identifier for a particular version of a Structured
	 *              Product Label for a product. Also referred to as the document
	 *              ID.
	 */
	public void setSPLId(String[] splId) {
		this.spl_id = splId;
	}

	/**
	 * @return the sPLSetId
	 */
	public String[] getSPLSetId() {
		return spl_set_id;
	}

	/**
	 * @param splSetId the sPLSetId to set
	 */
	public void setSPLSetId(String[] splSetId) {
		this.spl_set_id = splSetId;
	}

	/**
	 * @return The list of active ingredients of a drug product.
	 */
	public String[] getSubstanceName() {
		return substance_name;
	}

	/**
	 * @param substanceName The list of active ingredients of a drug product.
	 */
	public void setSubstanceName(String[] substanceName) {
		this.substance_name = substanceName;
	}

	/**
	 * @return Unique Ingredient Identifier, which is a non-proprietary, free,
	 *         unique, unambiguous, non-semantic, alphanumeric identifier based on a
	 *         substance’s molecular structure and/or descriptive information.
	 *         http://fdasis.nlm.nih.gov/srs/srs.jsp
	 */
	public String[] getUnII() {
		return unii;
	}

	/**
	 * @param unii Unique Ingredient Identifier, which is a non-proprietary, free,
	 *             unique, unambiguous, non-semantic, alphanumeric identifier based
	 *             on a substance’s molecular structure and/or descriptive
	 *             information. http://fdasis.nlm.nih.gov/srs/srs.jsp
	 */
	public void setUnII(String[] unii) {
		this.unii = unii;
	}

	/**
	 * @return Universal Product Code
	 *         https://en.wikipedia.org/wiki/Universal_Product_Code
	 */
	public String[] getUPC() {
		return upc;
	}

	/**
	 * @param upc Universal Product Code
	 *            https://en.wikipedia.org/wiki/Universal_Product_Code
	 */
	public void setUPC(String[] upc) {
		this.upc = upc;
	}
}