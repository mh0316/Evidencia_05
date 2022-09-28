public class Cliente extends Vehiculo {
    private String direccion, numeroTelefonico,correo;
    private boolean primerCompra;

    public Cliente(String nombre, String direccion, String numeroTelefonico, String correo, String rut){
        super(nombre, rut);
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.correo = correo;
        this.primerCompra = true;
        char[] data = {'a','b','c'};
        String str = new String(data);
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getNumeroTelefonico(){
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public double obtenerDescuento(){
        if(this.primerCompra){
            this.primerCompra = false;
            return 0.8;
        }else{
            return 1;
        }
    }
}
