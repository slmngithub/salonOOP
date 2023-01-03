public class testsalon {
    public static void main(String []arg){
        Cliente c=new Cliente();
        Cliente c1=new Cliente();
        c.Cliente("oussama" , "y8935" , true , "oro");
        c1.Cliente("jll" , "y258744" );
        System.out.println(c1.getDescuento());
        c1.tostring();
    }
}
