package spittr.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spittr.model.Spitter;

@Repository
public class HibernateSpitterRepository implements SpitterRepository {
    private final SessionFactory sessionFactory;

    @Autowired
    public HibernateSpitterRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public Spitter save(Spitter spitter) {
        return null;
    }

    public Spitter findByUsername(String username) {
        return null;
    }
}
