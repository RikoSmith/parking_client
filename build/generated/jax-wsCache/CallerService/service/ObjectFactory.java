
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _AddrTest_QNAME = new QName("http://service/", "AddrTest");
    private final static QName _AddrTestResponse_QNAME = new QName("http://service/", "AddrTestResponse");
    private final static QName _AddLot_QNAME = new QName("http://service/", "addLot");
    private final static QName _AddLotResponse_QNAME = new QName("http://service/", "addLotResponse");
    private final static QName _AddPerson_QNAME = new QName("http://service/", "addPerson");
    private final static QName _AddPersonResponse_QNAME = new QName("http://service/", "addPersonResponse");
    private final static QName _GetLots_QNAME = new QName("http://service/", "getLots");
    private final static QName _GetLotsResponse_QNAME = new QName("http://service/", "getLotsResponse");
    private final static QName _GetPersons_QNAME = new QName("http://service/", "getPersons");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://service/", "getPersonsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddrTest }
     * 
     */
    public AddrTest createAddrTest() {
        return new AddrTest();
    }

    /**
     * Create an instance of {@link AddrTestResponse }
     * 
     */
    public AddrTestResponse createAddrTestResponse() {
        return new AddrTestResponse();
    }

    /**
     * Create an instance of {@link AddLot }
     * 
     */
    public AddLot createAddLot() {
        return new AddLot();
    }

    /**
     * Create an instance of {@link AddLotResponse }
     * 
     */
    public AddLotResponse createAddLotResponse() {
        return new AddLotResponse();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link GetLots }
     * 
     */
    public GetLots createGetLots() {
        return new GetLots();
    }

    /**
     * Create an instance of {@link GetLotsResponse }
     * 
     */
    public GetLotsResponse createGetLotsResponse() {
        return new GetLotsResponse();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddrTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AddrTest")
    public JAXBElement<AddrTest> createAddrTest(AddrTest value) {
        return new JAXBElement<AddrTest>(_AddrTest_QNAME, AddrTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddrTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AddrTestResponse")
    public JAXBElement<AddrTestResponse> createAddrTestResponse(AddrTestResponse value) {
        return new JAXBElement<AddrTestResponse>(_AddrTestResponse_QNAME, AddrTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addLot")
    public JAXBElement<AddLot> createAddLot(AddLot value) {
        return new JAXBElement<AddLot>(_AddLot_QNAME, AddLot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addLotResponse")
    public JAXBElement<AddLotResponse> createAddLotResponse(AddLotResponse value) {
        return new JAXBElement<AddLotResponse>(_AddLotResponse_QNAME, AddLotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getLots")
    public JAXBElement<GetLots> createGetLots(GetLots value) {
        return new JAXBElement<GetLots>(_GetLots_QNAME, GetLots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLotsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getLotsResponse")
    public JAXBElement<GetLotsResponse> createGetLotsResponse(GetLotsResponse value) {
        return new JAXBElement<GetLotsResponse>(_GetLotsResponse_QNAME, GetLotsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPersons")
    public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
        return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsResponse> createGetPersonsResponse(GetPersonsResponse value) {
        return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME, GetPersonsResponse.class, null, value);
    }

}
