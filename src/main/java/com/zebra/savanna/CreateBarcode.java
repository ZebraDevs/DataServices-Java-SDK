package com.zebra.savanna;

import java.io.UnsupportedEncodingException;
import java.net.HttpRetryException;
import java.net.URLEncoder;

import com.zebra.savanna.Models.Errors.Error;

import org.json.JSONException;

/**
 * CreateBarcode --- Provides access to the Savanna barcode creation APIs.
 * 
 * @author SLippert@zebra.com
 *
 */
public final class CreateBarcode extends SavannaAPI {
	/**
	 * Generates a barcode from the text provided and returns a PNG image
	 * 
	 * @param symbology The barcode symbology.
	 * @param text      The data or text to include in the generated barcode.
	 *                  Usually an error will occur when the barcode symbology
	 *                  cannot support the text provided. Different symbology allow
	 *                  for numbers only, or alpha-numeric, or uppercase alphabets,
	 *                  and some restrict characters. For example: code39 only
	 *                  accepts numbers and uppercase letters.
	 * @return A byte array containing the png-encoded image
	 * @throws HttpRetryException           Thrown if there is an error calling the
	 *                                      service
	 * @throws Error                        Thrown if there is an error returned
	 *                                      from the service
	 * @throws UnsupportedEncodingException Thrown if there is an error encoding the
	 *                                      barcode text
	 */
	public static byte[] create(Symbology symbology, String text)
			throws HttpRetryException, JSONException, Error, UnsupportedEncodingException {
		return create(symbology, text, 1, Rotation.Normal, false);
	}

	/**
	 * Generates a barcode from the text provided and returns a PNG image
	 * 
	 * @param symbology   The barcode symbology.
	 * @param text        The data or text to include in the generated barcode.
	 *                    Usually an error will occur when the barcode symbology
	 *                    cannot support the text provided. Different symbology
	 *                    allow for numbers only, or alpha-numeric, or uppercase
	 *                    alphabets, and some restrict characters. For example:
	 *                    code39 only accepts numbers and uppercase letters.
	 * @param scale       Sets both the x-axis and the y-axis scaling factors. Must
	 *                    be an integer &gt; 0. Use if you want default X &amp; Y,
	 *                    just different size.
	 * @param rotate      Rotates the barcode in 90 degree increments.
	 * @param includeText Allows for the data included in the barcode to be printed
	 *                    in human readable form with the barcode (usually printed
	 *                    text under the linear barcode, this setting is ignored for
	 *                    many 2D symbologies such as qrcode).
	 * @return A byte array containing the png-encoded image
	 * @throws HttpRetryException           Thrown if there is an error calling the
	 *                                      service
	 * @throws Error                        Thrown if there is an error returned
	 *                                      from the service
	 * @throws UnsupportedEncodingException Thrown if there is an error encoding the
	 *                                      barcode text
	 */
	public static byte[] create(Symbology symbology, String text, int scale, Rotation rotate, boolean includeText)
			throws HttpRetryException, JSONException, Error, UnsupportedEncodingException {
		byte[] bytes = callServiceBytes(
				String.format("barcode/generate?symbology=%s&text=%s&scale=%s&rotate=%s&includeText=%s",
						symbology.toValue(), URLEncoder.encode(text, "UTF-8"), scale, rotate.toValue(), includeText));
		return bytes;
	}

	/**
	 * Generates a barcode from the text provided and returns a PNG image
	 * 
	 * @param symbology   The barcode symbology.
	 * @param text        The data or text to include in the generated barcode.
	 *                    Usually an error will occur when the barcode symbology
	 *                    cannot support the text provided. Different symbology
	 *                    allow for numbers only, or alpha-numeric, or uppercase
	 *                    alphabets, and some restrict characters. For example:
	 *                    code39 only accepts numbers and uppercase letters.
	 * @param scaleX      Sets the x-axis. Must be an integer &gt; 0. Use with
	 *                    scaleY, if using scale only, leave scaleX &amp; scaleY
	 *                    blank. Allows proportional changes to the resulting
	 *                    barcode, helpful with linear barcodes to make tall or
	 *                    short.
	 * @param scaleY      Sets the y-axis scaling factors. Must be an integer &gt;
	 *                    0. Use with scaleX.
	 * @param rotate      Rotates the barcode in 90 degree increments.
	 * @param includeText Allows for the data included in the barcode to be printed
	 *                    in human readable form with the barcode (usually printed
	 *                    text under the linear barcode, this setting is ignored for
	 *                    many 2D symbologies such as qrcode).
	 * @return A byte array containing the png-encoded image
	 * @throws HttpRetryException           Thrown if there is an error calling the
	 *                                      service
	 * @throws Error                        Thrown if there is an error returned
	 *                                      from the service
	 * @throws UnsupportedEncodingException Thrown if there is an error encoding the
	 *                                      barcode text
	 */
	public static byte[] create(Symbology symbology, String text, int scaleX, int scaleY, Rotation rotate,
			boolean includeText) throws HttpRetryException, JSONException, Error, UnsupportedEncodingException {
		byte[] bytes = callServiceBytes(String.format(
				"barcode/generate?symbology=%s&text=%s&scaleX=%s&scaleY=%s&rotate=%s&includeText=%s",
				symbology.toValue(), URLEncoder.encode(text, "UTF-8"), scaleX, scaleY, rotate.toValue(), includeText));
		return bytes;
	}
}