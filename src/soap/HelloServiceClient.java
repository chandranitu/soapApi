package soap;

import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;

public class HelloServiceClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/ws/hello?wsdl");
        QName qname = new QName("http://service/", "HelloServiceService");
        Service service = Service.create(url, qname);
        HelloService hello = service.getPort(HelloService.class);
        System.out.println(hello.sayHello("Chandra"));
    }
}
