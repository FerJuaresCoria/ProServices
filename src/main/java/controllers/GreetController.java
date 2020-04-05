package controllers;

import spark.Request;
import spark.Response;

public class GreetController {

    public String greet(Request request, Response response){
        return "Hola";
    }

    public String greet2(Request request, Response response){
        String name = request.params("name");
        String greet = "Hola "+name;
        return greet;
    }
}
