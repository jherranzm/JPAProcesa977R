package net.herranzmartin.project977r.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.herranzmartin.project977r.model.TblConsultaSQL;
import net.herranzmartin.project977r.services.ConsultasService;

import org.junit.Test;

public class TestTblConsultasSQL {

	@Test
	public void testGetAllItems() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("977R");
		EntityManager em = emf.createEntityManager();
		ConsultasService fs = new ConsultasService(em);
		List<TblConsultaSQL> list = fs.getAllItems();

		assert(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
		
	}

}
