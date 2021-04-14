package pl.pjatk.miccze;

import org.springframework.beans.factory.annotation.Value;

public class MyPojoClass {
    private String name;
    private int age;
    @Value("${my.custom.random}")
    private String randomValue;
    @Value("${my.radom:This is my default value}")
    private String radom;

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public String getRadom() {
        return radom;
    }

    public void setRadom(String radom) {
        this.radom = radom;
    }
    // @Value("${my.custom.property}")
   // private String tempValue;

 /*   public String getTempValue() {
        return tempValue;
    }

    public void setTempValue(String tempValue) {
        this.tempValue = tempValue;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyPojoClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void soutMe(){
        System.out.println(name);
    }
}
