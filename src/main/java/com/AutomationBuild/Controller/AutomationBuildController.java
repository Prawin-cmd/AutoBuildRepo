package com.AutomationBuild.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/automationbuild")
public class AutomationBuildController {
      @GetMapping(value="/get")
      public String get( ) {
    	  return "Hello world";
      }
}
