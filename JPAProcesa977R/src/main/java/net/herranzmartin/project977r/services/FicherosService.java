package net.herranzmartin.project977r.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import net.herranzmartin.project977r.model.Tbl000000;


public class FicherosService {
	
	private EntityManager em;
	
	public FicherosService(EntityManager em){
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	public List<Tbl000000> getAllItems(){
		
		List<Tbl000000> lista = null;
		
	    em.getTransaction().begin();
	    
	    
	    Query query = em.createQuery("SELECT t FROM Tbl000000 t");
	    lista = (List<Tbl000000>)query.getResultList();
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return lista;
	}

}
