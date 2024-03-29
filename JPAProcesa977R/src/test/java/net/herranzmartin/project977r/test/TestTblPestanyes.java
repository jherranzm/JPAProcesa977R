package net.herranzmartin.project977r.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.herranzmartin.project977r.model.TblPestanya;
import net.herranzmartin.project977r.services.PestanyesService;

public class TestTblPestanyes {

	@Test
	public void testGetAllItems() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("977R");
		EntityManager em = emf.createEntityManager();
		PestanyesService fs = new PestanyesService(em);
		List<TblPestanya> list = fs.getAllItems();

		assertTrue(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
		
	}


}
