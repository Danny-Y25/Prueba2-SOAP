package ec.edu.ups.clienteSOAP;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T11:42:12.946-05:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://soap.Prueba2Soap.ups.edu.ec/", name = "VehiculoSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface VehiculoSoap {

    @WebMethod
    @RequestWrapper(localName = "listarVehiculos", targetNamespace = "http://soap.Prueba2Soap.ups.edu.ec/", className = "ec.edu.ups.clienteSOAP.ListarVehiculos")
    @ResponseWrapper(localName = "listarVehiculosResponse", targetNamespace = "http://soap.Prueba2Soap.ups.edu.ec/", className = "ec.edu.ups.clienteSOAP.ListarVehiculosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ec.edu.ups.clienteSOAP.Vehiculo> listarVehiculos()
;

    @WebMethod
    @RequestWrapper(localName = "insertarVehiculo", targetNamespace = "http://soap.Prueba2Soap.ups.edu.ec/", className = "ec.edu.ups.clienteSOAP.InsertarVehiculo")
    @ResponseWrapper(localName = "insertarVehiculoResponse", targetNamespace = "http://soap.Prueba2Soap.ups.edu.ec/", className = "ec.edu.ups.clienteSOAP.InsertarVehiculoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String insertarVehiculo(

        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.clienteSOAP.Vehiculo arg0
    );
}
