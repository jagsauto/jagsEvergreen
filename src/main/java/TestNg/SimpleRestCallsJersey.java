package TestNg;
import com.sun.jersey.api.client.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;


public class SimpleRestCallsJersey {

    Client client = Client.create();
    private ClientResponse Cr;
    private WebResourceLinkHeaders Gl;

//http://www.mkyong.com/webservices/jax-rs/restful-java-client-with-jersey-client/
    @Test
    public void getRest() throws UniformInterfaceException, IOException, JSONException, InterruptedException {

        //WebResource resource = client.resource("http://www.google.com");
        WebResource resource = client.resource("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");


        Cr =  resource.accept("application/json").get(ClientResponse.class);
      System.out.println(Cr.getStatus());
      //  String output = Cr.getEntity(String.class);
      //  System.out.println(output);
        JSONObject jo1 = new JSONObject(Cr.getEntity(String.class));
        JSONArray Array1 = jo1.getJSONArray("weather");

        System.out.println(Array1);
        JSONObject jo2 = (JSONObject) Array1.get(0);
        JSONObject jo3 = (JSONObject) jo2.get("description");
        String x  = (String) jo3.get("description");
        System.out.println(jo3);
    }

}


 /* try {
          JSONObject jo1 = new JSONObject(response1.getEntity(String.class));
        JSONArray Array1 = jo1.getJSONArray("records");
        JSONObject jo2 = (JSONObject) Array1.get(0);
        JSONObject jo3 = (JSONObject) jo2.get("Zuora__Account__r");
        // print(jo2.get("Customer__r"));
        CustomerEmailId = (String) jo3.get("PersonEmail");
        } catch (Exception e) {

        print("Customer doesn't exist!  :  " + resource1);
        CustomerEmailId = null;
        }*/