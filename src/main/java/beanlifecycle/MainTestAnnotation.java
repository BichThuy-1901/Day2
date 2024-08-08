package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.Account;

public class MainTestAnnotation {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle/bean.xml");

        //destroy() method
        applicationContext.close();

    }
}
