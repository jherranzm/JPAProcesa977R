package net.herranzmartin.project977r.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.herranzmartin.project977r.model.TblCucCif;
import net.herranzmartin.project977r.services.ClientesService;

import org.junit.Test;

public class TestTblCucCif {

	@Test
	public void testGetAllItems() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("977R");
		EntityManager em = emf.createEntityManager();
		ClientesService fs = new ClientesService(em);
		List<TblCucCif> list = fs.getAllItems();

		assertTrue(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
		
	}

}
