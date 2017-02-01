
package com.businesslogicservice.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "businessLogicService", targetNamespace = "http://ws.businesslogicservice.com/", wsdlLocation = "https://businesslogicsentences.herokuapp.com/ws/businessLogic?wsdl")
public class BusinessLogicService
    extends Service
{

    private final static URL BUSINESSLOGICSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUSINESSLOGICSERVICE_EXCEPTION;
    private final static QName BUSINESSLOGICSERVICE_QNAME = new QName("http://ws.businesslogicservice.com/", "businessLogicService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://businesslogicsentences.herokuapp.com/ws/businessLogic?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUSINESSLOGICSERVICE_WSDL_LOCATION = url;
        BUSINESSLOGICSERVICE_EXCEPTION = e;
    }

    public BusinessLogicService() {
        super(__getWsdlLocation(), BUSINESSLOGICSERVICE_QNAME);
    }

    public BusinessLogicService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BUSINESSLOGICSERVICE_QNAME, features);
    }

    public BusinessLogicService(URL wsdlLocation) {
        super(wsdlLocation, BUSINESSLOGICSERVICE_QNAME);
    }

    public BusinessLogicService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BUSINESSLOGICSERVICE_QNAME, features);
    }

    public BusinessLogicService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BusinessLogicService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BusinessLogicModel
     */
    @WebEndpoint(name = "BusinessLogicImplPort")
    public BusinessLogicModel getBusinessLogicImplPort() {
        return super.getPort(new QName("http://ws.businesslogicservice.com/", "BusinessLogicImplPort"), BusinessLogicModel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BusinessLogicModel
     */
    @WebEndpoint(name = "BusinessLogicImplPort")
    public BusinessLogicModel getBusinessLogicImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.businesslogicservice.com/", "BusinessLogicImplPort"), BusinessLogicModel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUSINESSLOGICSERVICE_EXCEPTION!= null) {
            throw BUSINESSLOGICSERVICE_EXCEPTION;
        }
        return BUSINESSLOGICSERVICE_WSDL_LOCATION;
    }

}
