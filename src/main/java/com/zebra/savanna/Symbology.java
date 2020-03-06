package com.zebra.savanna;

/**
 * Symbology --- Describes barcode type.
 * 
 * @author SLippert@zebra.com
 *
 */
public enum Symbology implements IConvertible {
	/**
	 * AusPost 4 State Customer Code
	 */
	auspost,
	/**
	 * Aztec Code
	 */
	azteccode,
	/**
	 * Compact Aztec Code
	 */
	azteccodecompact,
	/**
	 * Aztec Runes
	 */
	aztecrune,
	/**
	 * BC412
	 */
	bc412,
	/**
	 * Channel Code
	 */
	channelcode,
	/**
	 * Codablock F
	 */
	codablockf,
	/**
	 * Code 11
	 */
	code11,
	/**
	 * Code 128
	 */
	code128,
	/**
	 * Code 16K
	 */
	code16k,
	/**
	 * Code 25
	 */
	code2of5,
	/**
	 * Italian Pharmacode
	 */
	code32,
	/**
	 * Code 39
	 */
	code39,
	/**
	 * Code 39 Extended
	 */
	code39ext,
	/**
	 * Code 49
	 */
	code49,
	/**
	 * Code 93
	 */
	code93,
	/**
	 * Code 93 Extended
	 */
	code93ext,
	/**
	 * Code One
	 */
	codeone,
	/**
	 * COOP 2 of 5
	 */
	coop2of5,
	/**
	 * Custom 4 state symbology
	 */
	daft,
	/**
	 * GS1 DataBar Expanded
	 */
	databarexpanded,
	/**
	 * GS1 DataBar Expanded Composite
	 */
	databarexpandedcomposite,
	/**
	 * GS1 DataBar Expanded Stacked
	 */
	databarexpandedstacked,
	/**
	 * GS1 DataBar Expanded Stacked Composite
	 */
	databarexpandedstackedcomposite,
	/**
	 * GS1 DataBar Limited
	 */
	databarlimited,
	/**
	 * GS1 DataBar Limited Composite
	 */
	databarlimitedcomposite,
	/**
	 * GS1 DataBar Omnidirectional
	 */
	databaromni,
	/**
	 * GS1 DataBar Omnidirectional Composite
	 */
	databaromnicomposite,
	/**
	 * GS1 DataBar Stacked
	 */
	databarstacked,
	/**
	 * GS1 DataBar Stacked Composite
	 */
	databarstackedcomposite,
	/**
	 * GS1 DataBar Stacked Omnidirectional
	 */
	databarstackedomni,
	/**
	 * GS1 DataBar Stacked Omnidirectional Composite
	 */
	databarstackedomnicomposite,
	/**
	 * GS1 DataBar Truncated
	 */
	databartruncated,
	/**
	 * GS1 DataBar Truncated Composite
	 */
	databartruncatedcomposite,
	/**
	 * Datalogic 2 of 5
	 */
	datalogic2of5,
	/**
	 * Data Matrix
	 */
	datamatrix,
	/**
	 * Data Matrix Rectangular
	 */
	datamatrixrectangular,
	/**
	 * DotCode
	 */
	dotcode,
	/**
	 * EAN-13
	 */
	ean13,
	/**
	 * EAN-13 Composite
	 */
	ean13composite,
	/**
	 * GS1-14
	 */
	ean14,
	/**
	 * EAN-2 (2 digit addon)
	 */
	ean2,
	/**
	 * EAN-5 (5 digit addon)
	 */
	ean5,
	/**
	 * EAN-8
	 */
	ean8,
	/**
	 * EAN-8 Composite
	 */
	ean8composite,
	/**
	 * Flattermarken
	 */
	flattermarken,
	/**
	 * GS1-128
	 */
	gs1_128,
	/**
	 * GS1-128 Composite
	 */
	gs1_128composite,
	/**
	 * GS1 Composite 2D Component
	 */
	gs1_cc,
	/**
	 * GS1 Data Matrix
	 */
	gs1datamatrix,
	/**
	 * GS1 Data Matrix Rectangular
	 */
	gs1datamatrixrectangular,
	/**
	 * GS1 North American Coupon
	 */
	gs1northamericancoupon,
	/**
	 * GS1 QR Code
	 */
	gs1qrcode,
	/**
	 * Han Xin Code
	 */
	hanxin,
	/**
	 * HIBC Aztec Code
	 */
	hibcazteccode,
	/**
	 * HIBC Codablock F
	 */
	hibccodablockf,
	/**
	 * HIBC Code 128
	 */
	hibccode128,
	/**
	 * HIBC Code 39
	 */
	hibccode39,
	/**
	 * HIBC Data Matrix
	 */
	hibcdatamatrix,
	/**
	 * HIBC Data Matrix Rectangular
	 */
	hibcdatamatrixrectangular,
	/**
	 * HIBC MicroPDF417
	 */
	hibcmicropdf417,
	/**
	 * HIBC PDF417
	 */
	hibcpdf417,
	/**
	 * HIBC QR Code
	 */
	hibcqrcode,
	/**
	 * IATA 2 of 5
	 */
	iata2of5,
	/**
	 * Deutsche Post Identcode
	 */
	identcode,
	/**
	 * Industrial 2 of 5
	 */
	industrial2of5,
	/**
	 * Interleaved 2 of 5 (ITF)
	 */
	interleaved2of5,
	/**
	 * ISBN
	 */
	isbn,
	/**
	 * ISMN
	 */
	ismn,
	/**
	 * ISSN
	 */
	issn,
	/**
	 * ITF-14
	 */
	itf14,
	/**
	 * Japan Post 4 State Customer Code
	 */
	japanpost,
	/**
	 * Royal Dutch TPG Post KIX
	 */
	kix,
	/**
	 * Deutsche Post Leitcode
	 */
	leitcode,
	/**
	 * Matrix 2 of 5
	 */
	matrix2of5,
	/**
	 * MaxiCode
	 */
	maxicode,
	/**
	 * MicroPDF417
	 */
	micropdf417,
	/**
	 * Micro QR Code
	 */
	microqrcode,
	/**
	 * MSI Modified Plessey
	 */
	msi,
	/**
	 * USPS Intelligent Mail
	 */
	onecode,
	/**
	 * PDF417
	 */
	pdf417,
	/**
	 * Compact PDF417
	 */
	pdf417compact,
	/**
	 * Two-track Pharmacode
	 */
	pharmacode2,
	/**
	 * Pharmaceutical Binary Code
	 */
	pharmacode,
	/**
	 * USPS PLANET
	 */
	planet,
	/**
	 * Plessey UK
	 */
	plessey,
	/**
	 * PosiCode
	 */
	posicode,
	/**
	 * USPS POSTNET
	 */
	postnet,
	/**
	 * Pharmazentralnummer (PZN)
	 */
	pzn,
	/**
	 * QR Code
	 */
	qrcode,
	/**
	 * Codabar
	 */
	rationalizedCodabar,
	/**
	 * Custom 1D symbology
	 */
	raw,
	/**
	 * Royal Mail 4 State Customer Code
	 */
	royalmail,
	/**
	 * SSCC-18
	 */
	sscc18,
	/**
	 * Miscellaneous symbols
	 */
	symbol,
	/**
	 * Telepen
	 */
	telepen,
	/**
	 * Telepen Numeric
	 */
	telepennumeric,
	/**
	 * Ultracode
	 */
	ultracode,
	/**
	 * UPC-A
	 */
	upca,
	/**
	 * UPC-A Composite
	 */
	upcacomposite,
	/**
	 * UPC-E
	 */
	upce,
	/**
	 * UPC-E Composite
	 */
	upcecomposite;

	/**
	 * Returns the string representation of this enum constant.
	 * 
	 * @return The name of the enum constant that can be used in a Savanna API
	 */
	public String toValue() {
		return super.toString().replace('_', '-');
	}

	/**
	 * Converts a string to a Symbology.
	 * 
	 * @param symbology The symbology string to convert to an enum constant.
	 * @return The enum constant that matches the symbology, or null if no symbology is matched..
	 */
	public static Symbology fromValue(String symbology) {
		try {
			return Symbology.valueOf(symbology.replace('-', '_'));
		} catch (Exception e) {
			return null;
		}
	}
}
