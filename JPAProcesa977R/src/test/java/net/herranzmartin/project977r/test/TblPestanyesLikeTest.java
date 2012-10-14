package net.herranzmartin.project977r.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.herranzmartin.project977r.model.TblPestanya;
import net.herranzmartin.project977r.services.PestanyesService;

import org.junit.Test;

public class TblPestanyesLikeTest {

	@Test
	public void testGetItemsLikeREG() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("977R");
		EntityManager em = emf.createEntityManager();
		PestanyesService fs = new PestanyesService(em);
		List<TblPestanya> list = fs.findByName("reg");

		assertTrue(list.size() > 0);
		
		System.out.println("List.size():" + list.size());
		for(TblPestanya pestanya : list){
			System.out.println(pestanya.toString());
		}
		
	}

}
