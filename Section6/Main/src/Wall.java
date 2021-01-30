public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0.0, 0.0);
    }
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        if (this.width < 0){
            return 0;
        } else {
            return this.width;
        }
    }
    public double getHeight() {
        if (this.height < 0){
            return 0;
        } else {
            return this.height;
        }
    }
    public double getArea(){
        if (this.height <0 || this. width<0){
            return 0;
        } else{
            return this.width * this.height;
        }
    }
    public void setWidth(double width){
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height){
        if (height < 0)
        {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}
