package tiendafideoutfit.modelos;

import tiendafideoutfit.modelos.Prenda;

public class ItemCarrito {
    private Prenda prenda;
    private int cantidadSeleccionada;

    public ItemCarrito(Prenda prenda, int cantidadSeleccionada) {
        this.prenda = prenda;
        this.cantidadSeleccionada = cantidadSeleccionada;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public int getCantidadSeleccionada() {
        return cantidadSeleccionada;
    }

    public double getTotal() {
        return prenda.getPrecio() * cantidadSeleccionada;
    }
    
    public String getCodigo() {
        return prenda.getCodigo();
    }
    
    public String getDescripcion() {
        return prenda.getDescripcion();
    }
    
    public String getDepartamento() {
        return prenda.getDepartamento();
    }
    
    public String getTalla() {
        return prenda.getTalla();
    }
    
    public String getColor() {
        return prenda.getColor();
    }
    
    public int getCantidad() {
        return cantidadSeleccionada;
    }
    
    public double getPrecio() {
        return prenda.getPrecio();
    }
}