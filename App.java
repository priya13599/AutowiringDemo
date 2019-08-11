package com.nucleus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring.xml");
        Student student = (Student)context.getBean("s1");
        System.out.println(student.getStudentid()+" "+student.getStudentname()+" "+student.getAddress().getCountry()+" "+student.getAddress().getState());
        
        		
    }
}
