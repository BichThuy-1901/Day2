package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeansLifeCycleAnnotation {
    @PostConstruct
    public void innit() throws Exception{
        System.out.println("init method is called");
    }
    @PreDestroy
    public  void destroy() throws RuntimeException{
        System.out.println("destroy method is called");
    }
}
