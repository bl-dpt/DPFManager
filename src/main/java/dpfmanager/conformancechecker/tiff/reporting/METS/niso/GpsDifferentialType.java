//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.08 at 01:08:28 PM CEST 
//


package dpfmanager.conformancechecker.tiff.reporting.METS.niso;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gpsDifferentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gpsDifferentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Measurement without differential correction"/>
 *     &lt;enumeration value="Differential correction applied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gpsDifferentialType")
@XmlEnum
public enum GpsDifferentialType {

    @XmlEnumValue("Measurement without differential correction")
    MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION("Measurement without differential correction"),
    @XmlEnumValue("Differential correction applied")
    DIFFERENTIAL_CORRECTION_APPLIED("Differential correction applied");
    private final String value;

    GpsDifferentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GpsDifferentialType fromValue(String v) {
        for (GpsDifferentialType c: GpsDifferentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
