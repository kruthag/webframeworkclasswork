package com.classwork5.classwork5.controller;

import org.springframework.web.bind.annotation.RestController;

import com.classwork5.classwork5.model.Ce1Model;
import com.classwork5.classwork5.service.Ce1Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class CE1 {
       @Autowired
       public Ce1Service service;
       @PostMapping("/api/children")
       public ResponseEntity<Ce1Model> postMethodName(@RequestBody Ce1Model cm) {
           try{
            service.saveMethod(cm);
            return new ResponseEntity<Ce1Model>(cm,HttpStatusCode.valueOf(201));
           }
           catch(Exception e)
           {
           return new ResponseEntity<Ce1Model>(cm,HttpStatusCode.valueOf(500));
           }
       }
       @GetMapping("/api/children/sortBy/{field}")
       public ResponseEntity<List<Ce1Model>> getMethodName(@PathVariable String field) {
           try{
              List<Ce1Model> li=service.sortedmethod(field);
              return new ResponseEntity<List<Ce1Model>>(li,HttpStatusCode.valueOf(200)); 
           }
           catch(Exception e)
           {
               return new ResponseEntity<>(HttpStatusCode.valueOf(404));
           }
       }
       @GetMapping("/api/children/{offset}/{pagesize}")
       public ResponseEntity<List<Ce1Model>> getMethodName1(@PathVariable int offset,@PathVariable int pagesize) {
           try{
              List<Ce1Model> li=service.pagedMethod(offset,pagesize);
              return new ResponseEntity<List<Ce1Model>>(li,HttpStatusCode.valueOf(200)); 
           }
           catch(Exception e)
           {
               return new ResponseEntity<>(HttpStatusCode.valueOf(404));
           }
       }
       @GetMapping("/api/children/{offset}/{pagesize}/{field}")
       public ResponseEntity<List<Ce1Model>> getMethodName2(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field) {
           try{
              List<Ce1Model> li=service.pageMethod(offset,pagesize,field);
              return new ResponseEntity<List<Ce1Model>>(li,HttpStatusCode.valueOf(200)); 
           }
           catch(Exception e)
           {
               return new ResponseEntity<>(HttpStatusCode.valueOf(404));
           }
       }
       
       
}
