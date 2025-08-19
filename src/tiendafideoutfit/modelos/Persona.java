package tiendafideoutfit.modelos;

/*La clase persona es una Super clase Abstracta que posee todos los atributos 
  básicos de una persona que se necesitarán para el proyecto.*/
public abstract class Persona {
    protected String nombre, apellido, cedula;
    
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
    }
    
    public abstract void setNombre(String nombre);
    public abstract String getNombre();
    public abstract void setApellido(String apellido);
    public abstract String getApellido();
    public abstract void setCedula(String cedula);
    public abstract String getCedula();
}