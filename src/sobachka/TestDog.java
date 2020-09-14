package sobachka;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Betty", 17,"Black");
        Dog d2 = new Dog("Royal face Stefany", 5,"White");
        Dog d3 = new Dog("Belyash",15,"Grey");
        d3.setAge(1);
        d1.intoAge();
        d2.intoAge();
        d3.intoAge();
    }
}
