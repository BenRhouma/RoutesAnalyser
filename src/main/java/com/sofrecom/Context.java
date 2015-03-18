/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofrecom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author z.benrhouma
 */
public class Context {
        public static final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-config.xml");

}
