/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessesionbeans;

import entities.Manufacturer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author julien
 */
@Stateless
public class ManufacturerFacade extends AbstractFacade<Manufacturer> {

    @PersistenceContext(unitName = "JavaPersistenceAPIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ManufacturerFacade() {
        super(Manufacturer.class);
    }
    
    public List<Manufacturer> getAllManufacturers() {
        Query queryAlValues = em.createNamedQuery("Manufacturer.findAll");
        
        return queryAlValues.getResultList();
    }
    
}
