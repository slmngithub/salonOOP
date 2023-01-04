import java.util.Date;

public class Elsalon {
    Cliente [] clientes;
    Visita [] visitas ;
    int numClientes;
    int numVisitas;
    public Elsalon(int maxClie , int maxVisit){

        this.clientes= new Cliente[maxClie];
        this.visitas=new Visita[maxVisit];
        this.numClientes=0;
        this.numVisitas=0;
    }
    public String getCliente(String DNI){
        String getclie="";
        for (int i=0 ; i<clientes.length;i++){
            if (DNI.equals(clientes[i].getDNI())){
                getclie=clientes[i].toString();
                break;
            }
            else {getclie="este DNI no existe";}
        }
        return getclie;
    }
    public void anadirCliente(Cliente c){
        if (numClientes<clientes.length){
            clientes[numClientes]=c;
            numClientes++;
        }
        else System.out.println("el salon es lleno");
    }
    public void bajaClinet(Cliente c){
        for (int i=0 ; i<clientes.length;i++){
            if (clientes[i].getDNI().equals(c.getDNI())){
                c.setEsSocio(false);
                c.settipo("0");
                break;
            }
            else {System.out.println("este cliente no es cliente de nuestro salon");}

        }
    }
    public void setMenbresiaCliente( Cliente c , String nuevotipo){
        for (int i=0 ; i<clientes.length;i++){
            if (clientes[i].getDNI().equals(c.getDNI()) && c.getEsSocio()==true){
                c.settipo(nuevotipo);
                break;
            }
            else System.out.println("este cliente no es socio");

        }
    }
    public void anadirVisitas(String DNI , Date fecha){
        for (int i=0 ; i<clientes.length;i++) {
            if (clientes[i].getDNI().equals(DNI)) {
                fecha = new Date();
                Visita v = new Visita(clientes[i], fecha);
                if (numVisitas < visitas.length) {
                    visitas[numVisitas] = v;
                    numVisitas++;
                    break;
                }
                else System.out.println("no hay mas visitas");

            }
        }
    }
    public void getVisitasCliente(Cliente c){
        for (int i=0 ; i<visitas.length ;i++){
            if (visitas[i].getCliente().getDNI().equals(c.getDNI())){
                System.out.println(visitas[i].toString());

            }
        }
    }
    public void mostrarClinetes(){
        for (int i=0 ; i<clientes.length;i++){
            System.out.println(clientes[i].toString());
        }
    }
    public void mostrarvisitas(){
        for (int i=0 ; i<visitas.length;i++){
            System.out.println(visitas[i].toString());
        }
    }

}
