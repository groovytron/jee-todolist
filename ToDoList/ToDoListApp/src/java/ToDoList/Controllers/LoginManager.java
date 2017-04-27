/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList.Controllers;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author julien
 */
@Named(value = "loginManager")
@Dependent
public class LoginManager {

    /**
     * Creates a new instance of LoginManager
     */
    public LoginManager() {
    }
    
    public static void logout() throws IOException {
        HttpSession currentSession;
        currentSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        currentSession.invalidate();
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.sendRedirect("login.jsp");
    }
    
}
