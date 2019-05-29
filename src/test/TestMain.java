package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        /*
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource
                ("spring.xml"));
        */
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        System.out.println(triangle.toString());
    }
}
