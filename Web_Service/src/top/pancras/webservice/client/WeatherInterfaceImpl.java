
package top.pancras.webservice.client;

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
@WebService(name = "WeatherInterfaceImpl", targetNamespace = "http://webservice.pancras.top/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWeatherByCity", targetNamespace = "http://webservice.pancras.top/", className = "top.pancras.webservice.client.GetWeatherByCity")
    @ResponseWrapper(localName = "getWeatherByCityResponse", targetNamespace = "http://webservice.pancras.top/", className = "top.pancras.webservice.client.GetWeatherByCityResponse")
    @Action(input = "http://webservice.pancras.top/WeatherInterfaceImpl/getWeatherByCityRequest", output = "http://webservice.pancras.top/WeatherInterfaceImpl/getWeatherByCityResponse")
    public String getWeatherByCity(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}