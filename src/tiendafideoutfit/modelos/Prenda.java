package tiendafideoutfit.modelos;

public class Prenda {
    protected String descripcion, departamento, talla, color, codigo;
    protected int cantidad;
    protected double precio, total;
    
    public Prenda(){
        this.descripcion = "";
        this.departamento = "";
        this.talla = "";
        this.color = "";
        this.codigo = "";
        this.cantidad = 0;
        this.precio = 0.00;
        this.total = 0.00;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
