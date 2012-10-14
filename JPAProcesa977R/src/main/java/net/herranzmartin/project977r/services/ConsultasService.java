package net.herranzmartin.project977r.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import net.herranzmartin.project977r.model.TblConsultaSQL;
import net.herranzmartin.project977r.model.TblCucCif;

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
	
	public boolean save(TblConsultaSQL obj){
	    em.getTransaction().begin();
	    
	    em.merge(obj);
	    
	    em.getTransaction().commit();
	    em.close();
	    
	    return true;
		
	}


	@SuppressWarnings("unchecked")
	public List<TblConsultaSQL> findByName(String texto) {
		if(texto == null || texto.equals("")) return getAllItems();
		
		List<TblConsultaSQL> lista = null;
		
	    em.getTransaction().begin();
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append("SELECT t FROM TblConsultaSQL t ")
	    	.append(" WHERE LOWER(t.nombre) LIKE :nom ")
	    	.append(" OR LOWER(t.definicion) LIKE :def");
	    Query query = em.createQuery(sb.toString());
	    query.setParameter("nom", "%" + texto.toLowerCase() + "%");
	    query.setParameter("def", "%" + texto.toLowerCase() + "%");

	    lista = (List<TblConsultaSQL>)query.getResultList();
	    
	    em.getTransaction().commit();
	    
	    return lista;
	}


}
