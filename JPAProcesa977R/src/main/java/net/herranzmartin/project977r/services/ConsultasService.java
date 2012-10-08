package net.herranzmartin.project977r.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import net.herranzmartin.project977r.model.TblConsultaSQL;

public class ConsultasService {
	
	private EntityManager em;
	
	public ConsultasService(EntityManager em){
		this.em = em;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<TblConsultaSQL> getAllItems(){
		
		List<TblConsultaSQL> lista = null;
		
	    em.getTransaction().begin();
	    
	    
	    Query query = em.createQuery("SELECT t FROM TblConsultaSQL t");
	    lista = (List<TblConsultaSQL>)query.getResultList();
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return lista;
	}

}
