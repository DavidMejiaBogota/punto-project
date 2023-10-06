public class Punto {
    private int x, y;

    //Construct
    public Punto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    //Construct
    public Punto(int xy) {
        this(xy, xy);
    }

    //Construct
    public Punto () {
        this(0, 0);
    }

    public final void setX(int x) {
        this.x = x;
    }

    public final void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double modulo(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
