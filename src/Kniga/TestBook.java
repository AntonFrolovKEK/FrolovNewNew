package Kniga;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Crime and Punishment","Romance(Detective)" );
        Book d2 = new Book("Treasure Island","Romance(adventure)");
        Book d3 = new Book("Call of Ctulhu","Horror story");
        System.out.println(d1);
        d1.pechat();
        d2.pechat();
        d3.pechat();
    }
}
