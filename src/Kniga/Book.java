package Kniga;

import java.lang.*;
public class Book {
    private String name;
    private String genre;
    public Book(String name1, String genre1){
        name = name1;
        genre = genre1;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre(String genre){
        return genre;
    }
    public void pechat(){
        System.out.println("Name:"+name+", Genre:"+genre);
    }
}
