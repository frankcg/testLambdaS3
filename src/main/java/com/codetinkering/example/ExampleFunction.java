package com.codetinkering.example;

import com.codetinkering.example.service.AWSS3Service;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ExampleFunction implements Function<Request, Response> {

    @Autowired
    private AWSS3Service awss3Service;


    @Override
    public Response apply(Request request) {
        Response resp = new Response();
        System.out.println(awss3Service.getObjectsFromS3());
        resp.setResultado(request.getNumberOne() + request.getNumberTwo());
        return resp;
    }

    /*@Override
    public String apply(MyPojo myPojo) {
        // Do something in your lambda function here
        return myPojo.getExampleField().toUpperCase();
    }

    @Data
    public class MyPojo {
        private String exampleField;
    }*/
}
