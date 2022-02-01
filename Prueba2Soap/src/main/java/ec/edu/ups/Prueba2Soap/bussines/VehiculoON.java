package ec.edu.ups.Prueba2Soap.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.Prueba2Soap.dao.*;
import ec.edu.ups.Prueba2Soap.modelo.Vehiculo;


@Stateless
public class VehiculoON implements VehiculoONLocal {

	
	@Inject
	private VehiculoDAO daoVehiculo;
	
	public void guardar(Vehiculo p) throws Exception {
		if(daoVehiculo.read(p.getPlaca())==null)
			daoVehiculo.insert(p);
		else
			daoVehiculo.update(p);
	}
	
	public List<Vehiculo> getCLientes(){
		return daoVehiculo.getList();
	}
}
