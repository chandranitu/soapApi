package soap;

import jakarta.xml.ws.Endpoint;

public class HelloServicePublisher {
    public static void main(String[] args) {
        HelloService service = new HelloService();
        Endpoint.publish("http://localhost:8080/ws/hello", service);
        System.out.println("Service is published!");
    }
}
