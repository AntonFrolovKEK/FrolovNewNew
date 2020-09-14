package Shape;

public class Shape {
    private String name;
    private int lenght;

    Shape(String name, int lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    public int getLenght(){
        return lenght;
    }
    @Override
    public String toString(){
        return this.name+" , "+getLenght()+"m";
    }
}
