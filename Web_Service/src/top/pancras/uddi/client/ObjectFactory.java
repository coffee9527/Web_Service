
package top.pancras.uddi.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the top.pancras.uddi.client package. 
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

    private final static QName _GetAreaList_QNAME = new QName("http://service.uddi.pancras.top/", "getAreaList");
    private final static QName _GetAreaListResponse_QNAME = new QName("http://service.uddi.pancras.top/", "getAreaListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: top.pancras.uddi.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAreaList }
     * 
     */
    public GetAreaList createGetAreaList() {
        return new GetAreaList();
    }

    /**
     * Create an instance of {@link GetAreaListResponse }
     * 
     */
    public GetAreaListResponse createGetAreaListResponse() {
        return new GetAreaListResponse();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uddi.pancras.top/", name = "getAreaList")
    public JAXBElement<GetAreaList> createGetAreaList(GetAreaList value) {
        return new JAXBElement<GetAreaList>(_GetAreaList_QNAME, GetAreaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uddi.pancras.top/", name = "getAreaListResponse")
    public JAXBElement<GetAreaListResponse> createGetAreaListResponse(GetAreaListResponse value) {
        return new JAXBElement<GetAreaListResponse>(_GetAreaListResponse_QNAME, GetAreaListResponse.class, null, value);
    }

}
