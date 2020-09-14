package Myachik;

import java.lang.*;
public class Ball {
    private String color;
    private int size;
    private String type;
    public Ball(String color1, int size1){
        color = color1;
        size = size1;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getSize() {
        return size;
    }
    public void pechat(){
        System.out.println("Color:"+color+", Size:"+size);
    }
}
