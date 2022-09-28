public class Vendedor extends Vehiculo {
    private String nombre, rut;
    private int edad;
    private int run;

    public Vendedor(String nombre, String rut, int edad, int run){
        super();
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.run = Integer.parseInt(String.valueOf(run));
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getRun(){
        return run;
    }

    public void setRun(String run){
        this.run = Integer.parseInt(run);
    }

    public double obtenerDescuento(){
        return 0.9;
    }
}