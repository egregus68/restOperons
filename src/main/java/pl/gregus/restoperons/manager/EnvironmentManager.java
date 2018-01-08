/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gregus.restoperons.manager;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import pl.gregus.restoperons.model.Environment;

/**
 *
 * @author Grzegorz
 */
@Stateless
public class EnvironmentManager {
    
    @PersistenceContext
    private EntityManager entityManager;
    

    public List<Environment> find() {
        TypedQuery<Environment> query = entityManager.createNamedQuery("", Environment.class);
        return query.getResultList();
    }
}
