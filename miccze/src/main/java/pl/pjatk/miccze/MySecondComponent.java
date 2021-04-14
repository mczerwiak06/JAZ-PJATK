package pl.pjatk.miccze;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.List;

@Component
public class MySecondComponent {

    public MySecondComponent(MyPojoClass myPojoClass, List<String> defaultData, MyPojoClass mySecondPojoClass, @Value("${my.custom.property}") String someName){
        System.out.println("Hello from MySecondComponent");
        myPojoClass.soutMe();
        mySecondPojoClass.soutMe();
        System.out.println(someName);
        //System.out.println(myPojoClass.getTempValue());
        System.out.println(myPojoClass.getRandomValue());
        System.out.println((myPojoClass.getRadom()));
        System.out.println(defaultData);
    }

    public void helloFromMethod(){
        System.out.println("Hello from MySecondComponent.helloFromMethod");
    }
}
