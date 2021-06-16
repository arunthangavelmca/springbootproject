package com.arun.springbootproject.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HomeController {

    //Sample for reading path variable Map
    @GetMapping("/RestAPI/Map/{Name}/{Age}/")
    public String pathVariableMap(@PathVariable Map<String,String> pathVar){

       String Name=pathVar.get("Name");
       String Age=pathVar.get("Age");
        return "Welcome "+Name+Age+" !";
    }

    //Sample for reading path variable String
    @GetMapping("/RestAPI/String/{Name}/")
    public String pathVariableString(@PathVariable String Name){

        return "Welcome "+Name+" !";
    }

    //Sample for reading Request Params String
    @GetMapping("/RestAPI/ReqParam/")
    public String reqParam(@RequestParam String Name){

        return "Welcome "+Name+" !";
    }

    //Sample for reading Request Params Map
    @GetMapping("/RestAPI/ReqParamMap/")
    public String reqParamMap(@RequestParam Map<String,String> reqMap){
        String name=reqMap.get("Name");
        String age=reqMap.get("Age");
        String s = "Welcome " + name + age;
        return s;
    }

    //Sample for reading Request Body Map
    @GetMapping("/RestAPI/ReqBody/")
    public String reqBody(@RequestBody Map<String,String> reqMap){
System.out.println("Request=="+reqMap.get("name"));
        return reqMap.get("name");
    }
}
