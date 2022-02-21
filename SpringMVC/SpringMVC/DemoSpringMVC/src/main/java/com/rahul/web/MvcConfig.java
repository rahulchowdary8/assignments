package com.rahul.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@Configuration
@EnableWebMvc
@ComponentScan("com.rahul")

public class MvcConfig extends WebMvcConfigurerAdapter 
{

}
