package vn.edu.iuh.fit.demonew.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.demonew.entities.Log;

import java.util.List;

public class LogRepository {

    private EntityManager em;

    public void addLog(Log log) {
        em.persist(log);
    }

    public Log getLog(long id) {
        return em.find(Log.class, id);
    }

    public List<Log> getAllLogs() {
        return em.createNamedQuery("Log.findAll", Log.class).getResultList();
    }
}
