package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Artista;

public class ControladorAlumno {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("artistas");
	

	
	/**
	 * 
	 * 
	 */
	public static List<Artista> findAll() {
		
		EntityManager em = entityManagerFactory.createEntityManager();
		Query q = em.createNativeQuery("SELECT * FROM artista;", Artista.class);
		List<Artista> l = q.getResultList();
		
		em.close();
		return l;
	}
	
	
	public static List<Artista> findByLikeNombre (String likeNombre) {
		EntityManager em = entityManagerFactory.createEntityManager();
		Query q = em.createNativeQuery("SELECT * FROM artista where nombre like ?", Artista.class);
		q.setParameter(1, "%" + likeNombre + "%");
		List<Artista> l = (List<Artista>) q.getResultList();
		
		em.close();
		return l;
	}
}
