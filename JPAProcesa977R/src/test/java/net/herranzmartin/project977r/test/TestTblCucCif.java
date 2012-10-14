package net.herranzmartin.project977r.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.herranzmartin.project977r.model.TblCucCif;
import net.herranzmartin.project977r.services.ClientesService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTblCucCif {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void setUp(){
		emf = Persistence.createEntityManagerFactory("977R");
		em = emf.createEntityManager();
	}

	@Test
	public void testGetItemsLikeFIN() {
		
		em = emf.createEntityManager();
		ClientesService fs = new ClientesService(em);
		List<TblCucCif> list = fs.findByName("FIN");

		assertTrue(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
	}
	
	
	@Test
	public void testGetAllItems() {
		
		em = emf.createEntityManager();
		ClientesService fs = new ClientesService(em);
		List<TblCucCif> list = fs.getAllItems();

		assertTrue(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
	}

}
