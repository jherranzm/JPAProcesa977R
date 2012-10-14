package net.herranzmartin.project977r.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import net.herranzmartin.project977r.model.TblCucCif;

public class ClientesService {
	
	private EntityManager em;
	
	public ClientesService(EntityManager em){
		this.em = em;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<TblCucCif> getAllItems(){
		
		List<TblCucCif> lista = null;
		
	    em.getTransaction().begin();
	    
	    
	    Query query = em.createQuery("SELECT t FROM TblCucCif t");
	    lista = (List<TblCucCif>)query.getResultList();
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return lista;
	}
	
	public boolean save(TblCucCif cliente){
	    em.getTransaction().begin();
	    
	    em.merge(cliente);
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return true;
		
	}


}
