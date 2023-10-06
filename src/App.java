public class App {
    public static void main(String[] args) throws Exception {
       Punto miObjeto = new Punto();
       //System.out.println(miObjeto.getX() + ", " + miObjeto.getY());
       /*miObjeto.setX(4);
       int x = miObjeto.getX();
       System.out.println(x);
       double d = miObjeto.modulo();
       System.out.println(d);
       miObjeto.setX(miObjeto.getX() + 1);
       int x1 = miObjeto.getX();
       System.out.println(x1);
        */
       PuntoTiempo obPT = new PuntoTiempo();
       //System.out.println(obPT.getX() + ", " + obPT.getY() + ", " + obPT.getT());
       //System.out.println(obPT);
       Punto p = new PuntoTiempo(1,2,3);
       ((PuntoTiempo)p).setT(4);
       //System.out.println(((PuntoTiempo)p).getT());

       Punto3d p3d = new Punto3d(0, 0, 0, 0);
       System.out.println(p3d.modulo());
    }
}

