
package com.storageservice.person.ws;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocalApiPersonModel", targetNamespace = "http://ws.person.storageservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocalApiPersonModel {


    /**
     * 
     * @param personId
     * @return
     *     returns com.storageservice.person.ws.Person
     */
    @WebMethod
    @WebResult(name = "bmi", targetNamespace = "")
    @RequestWrapper(localName = "getPersonInformation", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.GetPersonInformation")
    @ResponseWrapper(localName = "getPersonInformationResponse", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.GetPersonInformationResponse")
    @Action(input = "http://ws.person.storageservice.com/LocalApiPersonModel/getPersonInformationRequest", output = "http://ws.person.storageservice.com/LocalApiPersonModel/getPersonInformationResponse")
    public Person getPersonInformation(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "registration", targetNamespace = "")
    @RequestWrapper(localName = "registration", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.Registration")
    @ResponseWrapper(localName = "registrationResponse", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.RegistrationResponse")
    @Action(input = "http://ws.person.storageservice.com/LocalApiPersonModel/registrationRequest", output = "http://ws.person.storageservice.com/LocalApiPersonModel/registrationResponse")
    public int registration(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param pwd
     * @param email
     * @return
     *     returns com.storageservice.person.ws.Person
     */
    @WebMethod
    @WebResult(name = "login", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.LoginResponse")
    @Action(input = "http://ws.person.storageservice.com/LocalApiPersonModel/loginRequest", output = "http://ws.person.storageservice.com/LocalApiPersonModel/loginResponse")
    public Person login(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "idPerson", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.person.storageservice.com/", className = "com.storageservice.person.ws.UpdatePersonResponse")
    @Action(input = "http://ws.person.storageservice.com/LocalApiPersonModel/updatePersonRequest", output = "http://ws.person.storageservice.com/LocalApiPersonModel/updatePersonResponse")
    public int updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

}
