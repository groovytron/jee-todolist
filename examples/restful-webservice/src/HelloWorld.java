/**
 * Created by julien on 12/23/16.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorld {
    @GET
    @Produces
    public String getClichedMessage() {
        return "Hellor World";
    }
}
