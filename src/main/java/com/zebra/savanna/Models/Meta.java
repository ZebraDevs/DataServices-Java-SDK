package com.zebra.savanna.Models;

import java.net.URL;
import java.util.Date;

/**
 * Meta --- Includes a disclaimer, a link to the openFDA data license, and
 * information about the results.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class Meta {
	private String disclaimer;
	private URL terms;
	private URL license;
	private Date last_updated;
	private MetaResults results;

	/**
	 * @return Important details notes about openFDA data and limitations of the
	 *         dataset.
	 */
	public String getDisclaimer() {
		return disclaimer;
	}

	/**
	 * @param disclaimer Important details notes about openFDA data and limitations
	 *                   of the dataset.
	 */
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	/**
	 * @return Link to a web page with license terms that govern data within
	 *         openFDA.
	 */
	public URL getTerms() {
		return terms;
	}

	/**
	 * @param terms Link to a web page with license terms that govern data within
	 *              openFDA.
	 */
	public void setTerms(URL terms) {
		this.terms = terms;
	}

	/**
	 * @return Link to a web page with the license that governs data within openFDA.
	 */
	public URL getLicense() {
		return license;
	}

	/**
	 * @param license Link to a web page with the license that governs data within
	 *                openFDA.
	 */
	public void setLicense(URL license) {
		this.license = license;
	}

	/**
	 * @return The last date when this openFDA endpoint was updated. Note that this
	 *         does not correspond to the most recent record for the endpoint or
	 *         dataset. Rather, it is the last time the openFDA API was itself
	 *         updated.
	 */
	public Date getLastUpdated() {
		return last_updated;
	}

	/**
	 * @param lastUpdated The last date when this openFDA endpoint was updated. Note
	 *                    that this does not correspond to the most recent record
	 *                    for the endpoint or dataset. Rather, it is the last time
	 *                    the openFDA API was itself updated.
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.last_updated = lastUpdated;
	}

	/**
	 * @return Information about the results.
	 */
	public MetaResults getResults() {
		return results;
	}

	/**
	 * @param results Information about the results.
	 */
	public void setResults(MetaResults results) {
		this.results = results;
	}
}