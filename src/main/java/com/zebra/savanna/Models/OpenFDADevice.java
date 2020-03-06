package com.zebra.savanna.Models;

/**
 * OpenFDADevice --- Information about a recalled medical device.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class OpenFDADevice {
	private DeviceClass device_class;
	private String device_name;
	private String fei_number;
	private String[] k_number;
	private String medical_specialty_description;
	private String registration_number;
	private String regulation_number;

	/**
	 * @return A risk based classification system for all medical devices (Federal
	 *         Food, Drug, and Cosmetic Act, section 513).
	 */
	public DeviceClass getDeviceClass() {
		return device_class;
	}

	/**
	 * @param deviceClass A risk based classification system for all medical devices
	 *                    (Federal Food, Drug, and Cosmetic Act, section 513).
	 */
	public void setDeviceClass(DeviceClass deviceClass) {
		this.device_class = deviceClass;
	}

	/**
	 * @return This is the proprietary name, or trade name, of the cleared device.
	 */
	public String getDeviceName() {
		return device_name;
	}

	/**
	 * @param deviceName This is the proprietary name, or trade name, of the cleared
	 *                   device.
	 */
	public void setDeviceName(String deviceName) {
		this.device_name = deviceName;
	}

	/**
	 * @return Facility identifier assigned to facility by the FDA Office of
	 *         Regulatory Affairs.
	 */
	public String getFEINumber() {
		return fei_number;
	}

	/**
	 * @param feiNumber Facility identifier assigned to facility by the FDA Office
	 *                  of Regulatory Affairs.
	 */
	public void setFEINumber(String feiNumber) {
		this.fei_number = feiNumber;
	}

	/**
	 * @return FDA-assigned premarket notification number, including leading
	 *         letters. Leading letters "BK" indicates 510(k) clearance, or
	 *         Premarket Notification, cleared by Center for Biologics Evaluation
	 *         and Research. Leading letters "DEN" indicates De Novo, or Evaluation
	 *         of Automatic Class III Designation. Leading letter "K" indicates
	 *         510(k) clearance, or Premarket Notification. `Source`: 510(k)
	 */
	public String[] getKNumber() {
		return k_number;
	}

	/**
	 * @param kNumber FDA-assigned premarket notification number, including leading
	 *                letters. Leading letters "BK" indicates 510(k) clearance, or
	 *                Premarket Notification, cleared by Center for Biologics
	 *                Evaluation and Research. Leading letters "DEN" indicates De
	 *                Novo, or Evaluation of Automatic Class III Designation.
	 *                Leading letter "K" indicates 510(k) clearance, or Premarket
	 *                Notification. `Source`: 510(k)
	 */
	public void setKNumber(String[] kNumber) {
		this.k_number = kNumber;
	}

	/**
	 * @return Regulation Medical Specialty is assigned based on the regulation
	 *         (e.g. 21 CFR Part 888 is Orthopedic Devices) which is why Class 3
	 *         devices lack the "Regulation Medical Specialty" field.
	 */
	public String getMedicalSpecialtyDescription() {
		return medical_specialty_description;
	}

	/**
	 * @param medicalSpecialtyDescription Regulation Medical Specialty is assigned
	 *                                    based on the regulation (e.g. 21 CFR Part
	 *                                    888 is Orthopedic Devices) which is why
	 *                                    Class 3 devices lack the "Regulation
	 *                                    Medical Specialty" field.
	 */
	public void setMedicalSpecialtyDescription(String medicalSpecialtyDescription) {
		this.medical_specialty_description = medicalSpecialtyDescription;
	}

	/**
	 * @return Facility identifier assigned to facility by the FDA Office of
	 *         Regulatory Affairs.
	 */
	public String getRegistrationNumber() {
		return registration_number;
	}

	/**
	 * @param registrationNumber Facility identifier assigned to facility by the FDA
	 *                           Office of Regulatory Affairs.
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registration_number = registrationNumber;
	}

	/**
	 * @return The classification regulation in the Code of Federal Regulations
	 *         (CFR) under which the device is identified, described, and formally
	 *         classified (Code of Federal regulations Title 21, 862.00 through
	 *         892.00). The classification regulation covers various aspects of
	 *         design, clinical evaluation, manufacturing, packaging, labeling, and
	 *         postmarket surveillance of the specific medical device.
	 */
	public String getRegulationNumber() {
		return regulation_number;
	}

	/**
	 * @param regulationNumber The classification regulation in the Code of Federal
	 *                         Regulations (CFR) under which the device is
	 *                         identified, described, and formally classified (Code
	 *                         of Federal regulations Title 21, 862.00 through
	 *                         892.00). The classification regulation covers various
	 *                         aspects of design, clinical evaluation,
	 *                         manufacturing, packaging, labeling, and postmarket
	 *                         surveillance of the specific medical device.
	 */
	public void setRegulationNumber(String regulationNumber) {
		this.regulation_number = regulationNumber;
	}
}