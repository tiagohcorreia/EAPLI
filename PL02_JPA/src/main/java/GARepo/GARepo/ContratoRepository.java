package GARepo.GARepo;

import domain.ContratoAluguer;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ContratoRepository {

    private EntityManager getEntityManager(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DEMO_ORMPU");
        EntityManager manager = factory.createEntityManager();

        return manager;
    }

    public List<ContratoAluguer> findAll() {

        Query query = getEntityManager().createQuery("SELECT e FROM ContratoAluguer e");
        List<ContratoAluguer> list = query.getResultList();
        return list;
    }
}
