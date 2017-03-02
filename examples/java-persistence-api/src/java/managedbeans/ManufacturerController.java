/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import sessesionbeans.ManufacturerFacade;
import entities.Manufacturer;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author julien
 */
@Named(value = "manufacturerController")
@Dependent
public class ManufacturerController {
    
    @EJB
    private ManufacturerFacade manufacturereFacade;
    /**
     * Creates a new instance of ManufacturerController
     */
    public ManufacturerController() {
        
    }
    
    public List<Manufacturer> getManufacturers() {
        return this.manufacturereFacade.getAllManufacturers();
    } 
}
