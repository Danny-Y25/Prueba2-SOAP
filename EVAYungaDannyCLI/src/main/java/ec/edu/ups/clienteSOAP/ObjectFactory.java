
package ec.edu.ups.clienteSOAP;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.clienteSOAP package. 
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

    private final static QName _InsertarVehiculo_QNAME = new QName("http://soap.Prueba2Soap.ups.edu.ec/", "insertarVehiculo");
    private final static QName _InsertarVehiculoResponse_QNAME = new QName("http://soap.Prueba2Soap.ups.edu.ec/", "insertarVehiculoResponse");
    private final static QName _ListarVehiculos_QNAME = new QName("http://soap.Prueba2Soap.ups.edu.ec/", "listarVehiculos");
    private final static QName _ListarVehiculosResponse_QNAME = new QName("http://soap.Prueba2Soap.ups.edu.ec/", "listarVehiculosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.clienteSOAP
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarVehiculo }
     * 
     */
    public InsertarVehiculo createInsertarVehiculo() {
        return new InsertarVehiculo();
    }

    /**
     * Create an instance of {@link InsertarVehiculoResponse }
     * 
     */
    public InsertarVehiculoResponse createInsertarVehiculoResponse() {
        return new InsertarVehiculoResponse();
    }

    /**
     * Create an instance of {@link ListarVehiculos }
     * 
     */
    public ListarVehiculos createListarVehiculos() {
        return new ListarVehiculos();
    }

    /**
     * Create an instance of {@link ListarVehiculosResponse }
     * 
     */
    public ListarVehiculosResponse createListarVehiculosResponse() {
        return new ListarVehiculosResponse();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarVehiculo }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Prueba2Soap.ups.edu.ec/", name = "insertarVehiculo")
    public JAXBElement<InsertarVehiculo> createInsertarVehiculo(InsertarVehiculo value) {
        return new JAXBElement<InsertarVehiculo>(_InsertarVehiculo_QNAME, InsertarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarVehiculoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Prueba2Soap.ups.edu.ec/", name = "insertarVehiculoResponse")
    public JAXBElement<InsertarVehiculoResponse> createInsertarVehiculoResponse(InsertarVehiculoResponse value) {
        return new JAXBElement<InsertarVehiculoResponse>(_InsertarVehiculoResponse_QNAME, InsertarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarVehiculos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarVehiculos }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Prueba2Soap.ups.edu.ec/", name = "listarVehiculos")
    public JAXBElement<ListarVehiculos> createListarVehiculos(ListarVehiculos value) {
        return new JAXBElement<ListarVehiculos>(_ListarVehiculos_QNAME, ListarVehiculos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarVehiculosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarVehiculosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Prueba2Soap.ups.edu.ec/", name = "listarVehiculosResponse")
    public JAXBElement<ListarVehiculosResponse> createListarVehiculosResponse(ListarVehiculosResponse value) {
        return new JAXBElement<ListarVehiculosResponse>(_ListarVehiculosResponse_QNAME, ListarVehiculosResponse.class, null, value);
    }

}
