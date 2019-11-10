package webServer.wsimport;


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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestServiceImpl", targetNamespace = "http://webServer/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ping", targetNamespace = "http://webServer/", className = "webserver.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://webServer/", className = "webserver.PingResponse")
    @Action(input = "http://webServer/TestServiceImpl/pingRequest", output = "http://webServer/TestServiceImpl/pingResponse")
    public String ping(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}