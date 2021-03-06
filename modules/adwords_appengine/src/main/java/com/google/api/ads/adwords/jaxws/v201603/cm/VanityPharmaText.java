
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VanityPharmaText.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VanityPharmaText">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PRESCRIPTION_TREATMENT_WEBSITE_EN"/>
 *     &lt;enumeration value="PRESCRIPTION_TREATMENT_WEBSITE_ES"/>
 *     &lt;enumeration value="PRESCRIPTION_DEVICE_WEBSITE_EN"/>
 *     &lt;enumeration value="PRESCRIPTION_DEVICE_WEBSITE_ES"/>
 *     &lt;enumeration value="MEDICAL_DEVICE_WEBSITE_EN"/>
 *     &lt;enumeration value="MEDICAL_DEVICE_WEBSITE_ES"/>
 *     &lt;enumeration value="PREVENTATIVE_TREATMENT_WEBSITE_EN"/>
 *     &lt;enumeration value="PREVENTATIVE_TREATMENT_WEBSITE_ES"/>
 *     &lt;enumeration value="PRESCRIPTION_CONTRACEPTION_WEBSITE_EN"/>
 *     &lt;enumeration value="PRESCRIPTION_CONTRACEPTION_WEBSITE_ES"/>
 *     &lt;enumeration value="PRESCRIPTION_VACCINE_WEBSITE_EN"/>
 *     &lt;enumeration value="PRESCRIPTION_VACCINE_WEBSITE_ES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VanityPharmaText")
@XmlEnum
public enum VanityPharmaText {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Prescription treatment website
     *               
     * 
     */
    PRESCRIPTION_TREATMENT_WEBSITE_EN,

    /**
     * 
     *                 Sitio de tratamientos con receta
     *               
     * 
     */
    PRESCRIPTION_TREATMENT_WEBSITE_ES,

    /**
     * 
     *                 Prescription device website
     *               
     * 
     */
    PRESCRIPTION_DEVICE_WEBSITE_EN,

    /**
     * 
     *                 Sitio de dispositivos con receta
     *               
     * 
     */
    PRESCRIPTION_DEVICE_WEBSITE_ES,

    /**
     * 
     *                 Medical device website
     *               
     * 
     */
    MEDICAL_DEVICE_WEBSITE_EN,

    /**
     * 
     *                 Sitio de dispositivos m?dicos
     *               
     * 
     */
    MEDICAL_DEVICE_WEBSITE_ES,

    /**
     * 
     *                 Preventative treatment website
     *               
     * 
     */
    PREVENTATIVE_TREATMENT_WEBSITE_EN,

    /**
     * 
     *                 Sitio de tratamientos preventivos
     *               
     * 
     */
    PREVENTATIVE_TREATMENT_WEBSITE_ES,

    /**
     * 
     *                 Prescription contraception website
     *               
     * 
     */
    PRESCRIPTION_CONTRACEPTION_WEBSITE_EN,

    /**
     * 
     *                 Sitio de anticonceptivos con receta
     *               
     * 
     */
    PRESCRIPTION_CONTRACEPTION_WEBSITE_ES,

    /**
     * 
     *                 Prescription vaccine website
     *               
     * 
     */
    PRESCRIPTION_VACCINE_WEBSITE_EN,

    /**
     * 
     *                 Sitio de vacunas con receta
     *               
     * 
     */
    PRESCRIPTION_VACCINE_WEBSITE_ES;

    public String value() {
        return name();
    }

    public static VanityPharmaText fromValue(String v) {
        return valueOf(v);
    }

}
