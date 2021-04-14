package pl.pjatk.miccze;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MyFirstComponent {

    public MyFirstComponent(ApplicationContext applicationContext){
        System.out.println("Hello from MyFirstComponent");
        MySecondComponent mySecondComponent =  applicationContext.getBean("mySecondComponent", MySecondComponent.class);

        //mySecondComponent.helloFromMethod();
    }

    public void helloFromMethod(){
        System.out.println("Hello from MyFirstComponent.helloFromMethod");
    }

}
