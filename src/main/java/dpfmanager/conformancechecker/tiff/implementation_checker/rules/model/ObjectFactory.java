
package dpfmanager.conformancechecker.tiff.implementation_checker.rules.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dpfmanager.conformancechecker.tiff.implementation_checker.rules.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImplementationCheckerObject_QNAME = new QName("http://www.dpfmanager.org/ProfileChecker", "implementationCheckerObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dpfmanager.conformancechecker.tiff.implementation_checker.rules.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link ImplementationCheckerObjectType }
     * 
     */
    public ImplementationCheckerObjectType createImplementationCheckerObjectType() {
        return new ImplementationCheckerObjectType();
    }

    /**
     * Create an instance of {@link AssertType }
     * 
     */
    public AssertType createAssertType() {
        return new AssertType();
    }

    /**
     * Create an instance of {@link IncludeType }
     * 
     */
    public IncludeType createIncludeType() {
        return new IncludeType();
    }

    /**
     * Create an instance of {@link RulesType }
     * 
     */
    public RulesType createRulesType() {
        return new RulesType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link RuleType.Title }
     * 
     */
    public RuleType.Title createRuleTypeTitle() {
        return new RuleType.Title();
    }

    /**
     * Create an instance of {@link RuleType.Description }
     * 
     */
    public RuleType.Description createRuleTypeDescription() {
        return new RuleType.Description();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImplementationCheckerObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dpfmanager.org/ProfileChecker", name = "implementationCheckerObject")
    public JAXBElement<ImplementationCheckerObjectType> createImplementationCheckerObject(ImplementationCheckerObjectType value) {
        return new JAXBElement<ImplementationCheckerObjectType>(_ImplementationCheckerObject_QNAME, ImplementationCheckerObjectType.class, null, value);
    }

}
