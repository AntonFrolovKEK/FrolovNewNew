package Kniga;


public class PointMoveable extends Newww implements Movable{

    public PointMoveable(int x, int y) {
        super(x, y);
    }


    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }
}
