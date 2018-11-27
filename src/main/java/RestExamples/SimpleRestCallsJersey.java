package RestExamples;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResourceLinkHeaders;
import org.testng.annotations.Test;




public class SimpleRestCallsJersey {

    Client client = Client.create();
    private ClientResponse Cr;
    private WebResourceLinkHeaders Gl;

//http://www.mkyong.com/webservices/jax-rs/restful-java-client-with-jersey-client/
    @Test
    public void getRest(){

        //WebResource resource = client.resource("http://www.google.com");
        WebResource resource = client.resource("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");


        Cr =  resource.accept("application/json").get(ClientResponse.class);
      System.out.println(Cr.getStatus());
        String output = Cr.getEntity(String.class);
        System.out.println(output);


    }

}
