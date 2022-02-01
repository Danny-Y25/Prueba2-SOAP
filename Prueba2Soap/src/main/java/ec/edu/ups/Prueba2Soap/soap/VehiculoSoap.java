package ec.edu.ups.Prueba2Soap.soap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.Prueba2Soap.bussines.*;
import ec.edu.ups.Prueba2Soap.modelo.*;

@WebService
public class VehiculoSoap {
	
	@Inject
	private VehiculoONLocal vehiculoON;
	
	@WebMethod
	public String insertarVehiculo(Vehiculo vehiculo) {
		
		try {
			vehiculoON.guardar(vehiculo);
			return "Vehiculo Insertado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Vehiculo No Insertado";
		}
		
		
	}
	
	@WebMethod
	public List<Vehiculo> listarVehiculos(){
		return vehiculoON.getCLientes();
	}

}
