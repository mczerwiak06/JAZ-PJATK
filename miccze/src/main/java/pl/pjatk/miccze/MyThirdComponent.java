package pl.pjatk.miccze;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext){
        System.out.println("Hello from MyThirdComponent");
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent mySecondComponent =  applicationContext.getBean("mySecondComponent", MySecondComponent.class);

        myFirstComponent.helloFromMethod();
        mySecondComponent.helloFromMethod();
    }
}
