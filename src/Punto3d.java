public class Punto3d  extends PuntoTiempo {
    private int z;

    public Punto3d(int x, int y, int z, int t) {
        super(x, y, t);
        this.z = z;
    }

    @Override
    public double modulo() {
        return Math.sqrt(this.getX()*this.getX() + this.getY()*this.getY() + this.z*this.z);
    }
    
}
