package net.herranzmartin.project977r.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import net.herranzmartin.project977r.model.TblPestanya;

public class PestanyesService {
	
	private EntityManager em;
	
	public PestanyesService(EntityManager em){
		this.em = em;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<TblPestanya> getAllItems(){
		
		List<TblPestanya> lista = null;
		
	    em.getTransaction().begin();
	    
	    
	    Query query = em.createQuery("SELECT t FROM TblPestanya t");
	    lista = (List<TblPestanya>)query.getResultList();
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return lista;
	}

	@SuppressWarnings("unchecked")
	public List<TblPestanya> findByName(String texto) {
		if(texto == null || texto.equals("")) return getAllItems();
		
		List<TblPestanya> lista = null;
		
	    em.getTransaction().begin();
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append("SELECT t FROM TblPestanya t ")
	    	.append(" WHERE LOWER(t.nombre) LIKE :nom ")
	    	.append(" OR LOWER(t.rango) LIKE :def");
	    Query query = em.createQuery(sb.toString());
	    query.setParameter("nom", "%" + texto.toLowerCase() + "%");
	    query.setParameter("def", "%" + texto.toLowerCase() + "%");

	    lista = (List<TblPestanya>)query.getResultList();
	    
	    em.getTransaction().commit();
	    
	    return lista;
	}
	
	
	public boolean save(TblPestanya obj){
	    em.getTransaction().begin();
	    
	    em.merge(obj);
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return true;
		
	}

}
