import java.util.Date;

public class Visita {
     private Cliente cliente;
    private double importe;
    private Date fecha ;



    public Visita(Cliente cliente , Date fecha) {
        this.cliente = cliente;
        this.fecha=fecha;
        importe=0;
    }
    /*set methods*/
    public void setCliente( Cliente c){
        this.cliente=c;
    }
    public void setImporte( double imp){
        this.importe=imp;
    }
    public void setFecha( Date fe){
        this.fecha=fe;
    }
    /*get methods */
    public Cliente getCliente(){
        return cliente;
    }
    public double getImporte(){
        return importe;
    }
    public Date getFecha(){
        return fecha;
    }
    public double getImporte(double importeSinDes){

        if (cliente.getEsSocio()==true){
            if (cliente.gettipo()=="Platino" || cliente.gettipo()=="platino"){
                this.importe=importeSinDes - (importeSinDes*0.1);
            } else if (cliente.gettipo()=="Oro" || cliente.gettipo()=="oro") {
                this.importe=importeSinDes - (importeSinDes*0.15);
            } else if (cliente.gettipo()=="Premium" || cliente.gettipo()=="premium") {
                this.importe=importeSinDes - (importeSinDes*0.2);
            }
        }
        else this.importe=importeSinDes;

        return importe;
    }
    public String toString(){

        return cliente.toString() + "\n" + "la fecha de la visita es : " + fecha+ "\n" + "El importe es : " + importe;
    }


}
