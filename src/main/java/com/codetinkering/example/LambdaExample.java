package com.codetinkering.example;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

//public class LambdaExample extends SpringBootRequestHandler<ExampleFunction.MyPojo, String> {
public class LambdaExample extends SpringBootRequestHandler<Request, Response> {
}
