import java.nio.channels.Pipe;
import java.security.PublicKey;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public double distance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }
    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double distance(Point secondPoint){
        int x = secondPoint.getX();
        int y = secondPoint.getY();
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y - y)*(this.y - y));
    }
}
