
package tiendafideoutfit.modelos;

public class ResumenPedido {
    public int numero;
    public String fecha;
    public String cliente;
    public double total;
    
    public ResumenPedido(int numero, String fecha, String cliente, double total) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
    }

    public int getNumero() {
    return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }
}
