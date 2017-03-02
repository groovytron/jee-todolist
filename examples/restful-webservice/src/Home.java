/**
 * Created by julien on 12/23/16.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class Home {
    @GET
    @Produces
    public String homeView() {
        return "Welcome Home";
    }
}
