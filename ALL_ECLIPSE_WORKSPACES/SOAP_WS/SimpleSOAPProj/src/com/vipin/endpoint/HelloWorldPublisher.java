package com.vipin.endpoint;

import javax.xml.ws.Endpoint;  
import com.vipin.soap.impl.HelloWorldImpl;

public class HelloWorldPublisher{  
  public static void main(String[] args) {  
     Endpoint.publish("http://localhost:3333/ws/hello", new HelloWorldImpl());
     System.out.println("After EndPoint.publish()");
      }  
}