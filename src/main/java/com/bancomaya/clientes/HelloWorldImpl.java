
package com.bancomaya.clientes;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bancomaya.clientes.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String bienvenidoSOAP(String nombre) {
        return "Hola " + nombre + " Binveniso a curso de SOAP";
    }
}

