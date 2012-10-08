package net.herranzmartin.project977r.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.herranzmartin.project977r.model.Tbl000000;
import net.herranzmartin.project977r.services.FicherosService;

import org.junit.Test;

public class TestTbl000000 {

	@Test
	public void testGetAllFicheros() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("977R");
		EntityManager em = emf.createEntityManager();
		FicherosService fs = new FicherosService(em);
		List<Tbl000000> list = fs.getAllItems();

		assert(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
		
	}

}
