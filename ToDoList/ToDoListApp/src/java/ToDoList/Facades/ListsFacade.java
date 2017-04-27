/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList.Facades;

import ToDoList.Entities.Lists;
import ToDoList.Entities.Tasks;
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
    
    public List<Tasks> findListTasks(Lists list) {
        Query query = em.createNamedQuery("Tasks.fromListId");
        query.setParameter("listId", list);
        return (List<Tasks>)query.getResultList();
    }
    
}
