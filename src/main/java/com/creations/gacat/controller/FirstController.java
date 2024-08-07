package com.creations.gacat.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
//need to write get method
    @GetMapping("/aa")
    public String catRemo(){
        //System.out.println("I got the catRemo .....");
        return "I got the catRemo....yahooo..";
    }

//need to write delete method
    @DeleteMapping("/ab")
    public String DogRemo(){
        return "we can delete the mapping .....";
    }
//need to write post method
    @PostMapping("/remo")
  public String PostRemo(){
    return "we can post the mapping .....";
}
//need to write put method
   // @PutMapping


}
