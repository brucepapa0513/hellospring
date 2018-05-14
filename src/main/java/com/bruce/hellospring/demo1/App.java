package com.bruce.hellospring.demo1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    //通过上下文配置Bean
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter1/spring.xml");
        Person person = context.getBean(Person.class);
        person.sayHello();
        context.close();
    }

}
