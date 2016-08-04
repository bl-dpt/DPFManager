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
 * <p>Java class for componentUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="componentUseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="image data"/>
 *     &lt;enumeration value="associated alpha data"/>
 *     &lt;enumeration value="unassociated alpha data"/>
 *     &lt;enumeration value="range data"/>
 *     &lt;enumeration value="unspecified data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "componentUseType")
@XmlEnum
public enum ComponentUseType {

    @XmlEnumValue("image data")
    IMAGE_DATA("image data"),
    @XmlEnumValue("associated alpha data")
    ASSOCIATED_ALPHA_DATA("associated alpha data"),
    @XmlEnumValue("unassociated alpha data")
    UNASSOCIATED_ALPHA_DATA("unassociated alpha data"),
    @XmlEnumValue("range data")
    RANGE_DATA("range data"),
    @XmlEnumValue("unspecified data")
    UNSPECIFIED_DATA("unspecified data");
    private final String value;

    ComponentUseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentUseType fromValue(String v) {
        for (ComponentUseType c: ComponentUseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
