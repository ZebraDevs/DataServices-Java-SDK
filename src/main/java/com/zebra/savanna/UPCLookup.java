package com.zebra.savanna;

import java.net.HttpRetryException;

import com.google.gson.Gson;
import com.zebra.savanna.Models.BarcodeData;
import com.zebra.savanna.Models.Errors.Error;

import org.json.JSONException;

/**
 * UPCLookup --- Provides access to the Savanna UPC Lookup API.
 * 
 * @author SLippert@zebra.com
 *
 */
public final class UPCLookup extends SavannaAPI {
	/**
	 * Retrieves product information in JSON format for a provided UPC code
	 * 
	 * @param upc UPC Code
	 * @return A string containing product information for the provided UPC
	 * @throws HttpRetryException Thrown if there is an error calling the service
	 * @throws Error              Thrown if there is an error returned from the
	 *                            service
	 */
	public static String lookup(String upc) throws HttpRetryException, JSONException, Error {
		return callService("barcode/lookup?upc=" + upc);
	}

	/**
	 * Retrieves product information in JSON format for a provided UPC code
	 * 
	 * @param upc UPC Code
	 * @return Product information for the provided UPC.
	 * @throws HttpRetryException Thrown if there is an error calling the service
	 * @throws Error              Thrown if there is an error returned from the
	 *                            service
	 */
	public static BarcodeData deserializeLookup(String upc) throws HttpRetryException, JSONException, Error {
		String json = lookup(upc);
		Gson gson = new Gson();
		return gson.fromJson(json, BarcodeData.class);
	}
}