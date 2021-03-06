
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Parking", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Parking {


    /**
     * 
     * @return
     *     returns java.util.List<service.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersons", targetNamespace = "http://service/", className = "service.GetPersons")
    @ResponseWrapper(localName = "getPersonsResponse", targetNamespace = "http://service/", className = "service.GetPersonsResponse")
    @Action(input = "http://service/Parking/getPersonsRequest", output = "http://service/Parking/getPersonsResponse")
    public List<Person> getPersons();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLots", targetNamespace = "http://service/", className = "service.GetLots")
    @ResponseWrapper(localName = "getLotsResponse", targetNamespace = "http://service/", className = "service.GetLotsResponse")
    @Action(input = "http://service/Parking/getLotsRequest", output = "http://service/Parking/getLotsResponse")
    public List<String> getLots();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addLot", targetNamespace = "http://service/", className = "service.AddLot")
    @ResponseWrapper(localName = "addLotResponse", targetNamespace = "http://service/", className = "service.AddLotResponse")
    @Action(input = "http://service/Parking/addLotRequest", output = "http://service/Parking/addLotResponse")
    public String addLot(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://service/", className = "service.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://service/", className = "service.AddPersonResponse")
    @Action(input = "http://service/Parking/addPersonRequest", output = "http://service/Parking/addPersonResponse")
    public String addPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        long arg6);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "AddrTest")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddrTest", targetNamespace = "http://service/", className = "service.AddrTest")
    @ResponseWrapper(localName = "AddrTestResponse", targetNamespace = "http://service/", className = "service.AddrTestResponse")
    @Action(input = "http://service/Parking/AddrTestRequest", output = "http://service/Parking/AddrTestResponse")
    public List<String> addrTest();

}
