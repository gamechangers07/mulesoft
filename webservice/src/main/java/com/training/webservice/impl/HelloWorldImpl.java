package com.training.webservice.impl;

import javax.jws.WebService;

import com.training.webservice.HelloWorld;

@WebService(endpointInterface = "com.training.webservice.HelloWorld",
serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

public String sayHi(String text) {
return "Hello " + text;
}
}