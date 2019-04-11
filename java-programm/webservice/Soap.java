import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class Soap{

    @WebMethod
    public String greetings(String str)
    {
        return "Good "+ str + "..!!";
    }

    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:8888/soapWSTest", new Soap());
    }
}

