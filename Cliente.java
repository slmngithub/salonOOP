public class Cliente {
    private String nombre;
    private String DNI;
    private boolean EsSocio;
    private String tipo;
    public void Cliente(String nombre , String DNI , boolean  EsSocio , String tipo){
        this.nombre=nombre;
        this.DNI=DNI;
        this.EsSocio=EsSocio;
        this.tipo=tipo;

    }
    public void Cliente( String nombre , String DNI){

        this.nombre=nombre;
        this.DNI=DNI;
        EsSocio=false;

    }
    /*set name*/
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    /*get name*/
    public  String getnombre(){
        return nombre;
    }
    /* set DNI*/
    public void setDNI(String DNI){
        this.DNI=DNI;
    }
    /*get DNI*/
    public  String getDNI(){
        return DNI;
    }
    /*set es socio*/
    public void setEsSocio(boolean EsSocio){
        this.EsSocio=EsSocio;
    }
    /*get es socio*/
    public boolean getEsSocio(){
          return EsSocio;
    }
    /*set type*/
    public void settipo(String tipo){
        this.tipo=tipo;
    }
    /*get type*/
    public  String gettipo(){
        return tipo;
    }
    /*get Descuento()*/
    public String getDescuento(){
        String Descuento = "";
        if (EsSocio==true){
            if (tipo=="Platino" || tipo=="platino"){
                Descuento="su descuento es 10%";
            } else if (tipo=="Oro" || tipo=="oro") {
                Descuento="su descuento es 15%";
            } else if (tipo=="Premium" || tipo=="premium") {
                Descuento="su descuento es 20%";
            }
        }
        else Descuento="0";
        return Descuento;

    }
    public  String toString(){

        return String.format("El nombre del cliente es : " + getnombre() + "\n" +"El DNI del cliente es : " + getDNI() + "\n" + "El cliente ES SOCIO ? " + getEsSocio() + "\n" +  "El tipo del cliente es : " + gettipo() );

    }
}
