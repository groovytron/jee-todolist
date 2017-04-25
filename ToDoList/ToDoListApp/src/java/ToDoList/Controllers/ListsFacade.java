/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList.Controllers;

import ToDoList.Entities.Lists;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author julien
 */
@Stateless
public class ListsFacade extends AbstractFacade<Lists> {

    @PersistenceContext(unitName = "ToDoListAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ListsFacade() {
        super(Lists.class);
    }
    
}
