package ec.edu.ups.Prueba2Soap.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.Prueba2Soap.modelo.*;

@Stateless
public class VehiculoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Vehiculo veh) {
		em.persist(veh);
	}
	
	public void update(Vehiculo  veh) {
		em.merge(veh);
	}
	
	public Vehiculo read(String id) {
		Vehiculo  veh=em.find(Vehiculo.class, id);
		return(veh);
	}
	
	public void delete(String id) {
		Vehiculo veh=em.find(Vehiculo.class, id);
		em.remove(veh);
	}
	
	public List<Vehiculo> getList(){
		
		List<Vehiculo> listado= new ArrayList<Vehiculo>();
		
		String jpql ="SELECT veh FROM Vehiculo veh";
		Query query=em.createQuery(jpql, Vehiculo.class);
		listado=query.getResultList();
		
		return listado;
		
	}

}
