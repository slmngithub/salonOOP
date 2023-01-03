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
    public void Cliente( String nombre , String DNI , boolean EsSocio){

        this.nombre=nombre;
        this.DNI=DNI;
        this.EsSocio=EsSocio;
        EsSocio=false;

    }
    /*set name*/
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    /*get name*/
    public  String getnombre(String nombre){
        return nombre;
    }
    /* set DNI*/
    public void setDNI(String DNI){
        this.DNI=DNI;
    }
    /*get DNI*/
    public  String getDNI(String DNI){
        return DNI;
    }
    /*set es socio*/
    public void setEsSocio(boolean EsSocio){
        this.EsSocio=EsSocio;
    }
    /*get es socio*/
    public String getEsSocio(boolean EsSocio){
        if (EsSocio== true) {return "Es Socio";}
        else return "No Es Socio";
    }
    /*set type*/
    public void settipo(String tipo){
        this.tipo=tipo;
    }
    /*get type*/
    public  String gettipo(String tipo){
        return tipo;
    }
}
