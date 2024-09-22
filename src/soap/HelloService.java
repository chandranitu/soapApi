package soap;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public class HelloService {

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}

