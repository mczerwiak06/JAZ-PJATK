package pl.pjatk.miccze;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyConfigClass {

    @Bean
    public MyPojoClass myPojoClass(MyPojoClass mySecondPojoClass){
        System.out.println("Hello from MyPojoClass");
        mySecondPojoClass.setName("Changed value");
        return new MyPojoClass("some String value from AppConfig", 15);
    }

    @Bean
    public MyPojoClass mySecondPojoClass() {
        return new MyPojoClass("something", 50);
    }

    @Bean
    public List<String> defaultData() {
        System.out.println("Hello from defaultData");
        return List.of("1", "2", "3");
    }
    @Bean
    @ConditionalOnProperty(prefix ="some", name = "value")
    public MyPojoClass myThirdPojoClass() {
        System.out.println("I was created on condition of existance of some.value = true.");
        return new MyPojoClass("some String value", 20);
    }

}
