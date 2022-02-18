package com.springcache.demo.controller;

import java.util.Arrays;  
import java.util.List;  
import org.springframework.cache.annotation.Cacheable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.springcache.demo.model.Instrument;  
@RestController  
public class InstrumentController   
{  
@RequestMapping("/Instrumentinfo")  
//defines a cache for method's return value  
@Cacheable(value="InstrumentInfo")  
public List InstrumentInformation()  
{  
System.out.println("Instrument information from cache");
System.out.println("Id:1,Instrument No:9090,Ownership Group:JLR Calibaration Centre,Location:UK,Status:Active");
//adding customer detail in the List  
    List detail=Arrays.asList(new Instrument("1","9090","JLR Calibaration Centre","UK","Active")
                              
                             );  
return detail;  
}  
}  
