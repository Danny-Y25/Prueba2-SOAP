package ec.edu.ups.Prueba2Soap.bussines;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import ec.edu.ups.Prueba2Soap.modelo.Vehiculo;

@Local
public interface VehiculoONLocal {
	
	public void guardar(Vehiculo p) throws Exception;
	
	public List<Vehiculo> getCLientes();
}
