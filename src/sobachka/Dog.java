package sobachka;

import java.lang.*;
public class Dog {
    private String name;
    private int age;
    private String color;
    public Dog(String name1, int age1,String color1){
        name = name1;
        age = age1;
        color = color1;
    }
    public Dog(String n){
        name = n;
        age = 0;
        color="Unknown";
    }
    public Dog(){
        name = "doggy";
        age = 0;
        color="Rainbow";
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }

    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoAge(){
        System.out.println(name+"'s age is "+age+" years "+color+" color");
    }
}