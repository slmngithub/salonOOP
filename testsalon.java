import java.util.Date;

public class testsalon {
    public static void main(String []arg){
        Cliente c=new Cliente();
        Cliente c1=new Cliente();
        Cliente c2 = new Cliente();
        c.Cliente("oussama" , "y8935" , true , "oro");
        c1.Cliente("jll" , "y258744" );
        c2.Cliente("messi" , "x84925y" , true , "Premium");
        Visita v = new Visita(c2 , new Date());
        Visita v1 = new Visita(c , new Date());
        Visita v2 = new Visita(c1 , new Date());
        v.setImporte(1000);
        v1.setImporte(100);
        v2.setImporte(50);
        Elsalon s = new Elsalon(3 , 3);
        s.anadirCliente(c2);
        s.anadirCliente(c);
        s.anadirCliente(c1);
        System.out.println(s.getCliente("x84925y"));
        s.bajaClinet(c);
        System.out.println(c.getEsSocio());

    }
}
